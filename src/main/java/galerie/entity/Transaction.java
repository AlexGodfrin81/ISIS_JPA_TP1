package galerie.entity;
import java.util.Date;
import javax.persistence.*;
import lombok.*;
/**
 *
 * @author ALEX
 */
@Getter @Setter @RequiredArgsConstructor @ToString
@Entity
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    private Date venduLe;
    
    @Column(unique=true)
    private float prixVente;
    
    @ManyToOne
    private Exposition exposition;
    
    @OneToOne(optional=true)
    private Tableau tableau;
    
    @ManyToOne
    private Personne personne;
}
