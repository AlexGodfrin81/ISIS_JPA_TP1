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
public class Exposition implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    private LocalDate debut;
    
    @Column(unique=true)
    private String intitule;
    
    @Column(unique=true)
    private int duree;
    
    @OneToMany
    private List<Achat> transactions;
    
    @ManyToMany(mappedBy="expositions")
    private List<Tableau> tableaux = new LinkedList<>();
    
    @ManyToOne
    @JoinColumn(name="galerie_id")
    private Galerie galerie;
}
