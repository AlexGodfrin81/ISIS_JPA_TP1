package galerie.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.*;
/**
 *
 * @author ALEX
 */
@Getter @Setter @RequiredArgsConstructor @ToString
@Entity
public class Artiste extends Personne implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    private String biographie;
    
    @OneToMany
    private List<Tableau> tableaux;
}
