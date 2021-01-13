package galerie.entity;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
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
    private LocalDate debut;
    
    @Column(unique=true)
    private String intitule;
    
    @Column(unique=true)
    private int duree;
    
    @OneToMany(mappedBy = "exposition")
    private List<Transaction> transactions = new LinkedList<>();
    
    @ManyToMany
    @JoinTable(name="expo_tableau",joinColumns = 
                @JoinColumn(name = "exposition_id", referencedColumnName="id"),
        inverseJoinColumns = 
                @JoinColumn(name = "tableau_id",  referencedColumnName="id")
    )  
    private List<Tableau> tableaux = new LinkedList<>();
    
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
