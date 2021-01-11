package galerie.entity;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;
/**
 *
 * @author ALEX
 */
@Getter @Setter @RequiredArgsConstructor @ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Personne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    private String nom;
    
    @Column(unique=true, nullable=true)
    private String adresse;
    
    @OneToMany
    private List<Transaction> transactions;
    
    public float budgetArt(int annee){
        float res = 0f;
        for (Transaction t : transactions){
            Date d = t.getVenduLe();
            if (d.after(new Date(annee, 1, 1)) && d.before(new Date(annee, 12, 31))){
                res+=t.getPrixVente();
            }
        }
        return res;
    }
    
}
