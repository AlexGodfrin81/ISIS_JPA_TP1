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
public class Exposition {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    private Date debut;
    
    @Column(unique=true)
    private String intitule;
    
    @Column(unique=true)
    private int duree;
    
    @OneToMany(mappedBy = "exposition")
    private List<Transaction> transactions;
    
    @ManyToMany
    private List<Tableau> tableaux;
    
    @ManyToOne
    private Galerie galerie;
    
    public float CA(){
        float res = 0f;
        for (Transaction t : transactions){
            res+=t.getPrixVente();
        }
        return res;
    }
}
