package galerie.entity;
import java.io.Serializable;
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
public class Achat implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    private LocalDate vendu_le;
    
    @Column(unique=true)
    private float prix_vente;
    
    @ManyToOne
    @JoinColumn(name="exposition_id", nullable=false)
    private Exposition exposition;
    
    @OneToOne(optional=true)
    private Tableau tableau;
    
    @ManyToOne
    @JoinColumn(name="personne_id")
    private Personne personne;
}
