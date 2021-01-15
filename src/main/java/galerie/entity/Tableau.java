package galerie.entity;
import java.io.Serializable;
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
public class Tableau implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    private String titre;
    
    @Column(unique=true)
    private String support;
    
    @Column(unique=true)
    private int largeur;
    
    @Column(unique=true)
    private int hauteur;
    
    @ManyToMany
    private List<Exposition> expositions = new LinkedList<>();
    
    @OneToOne(mappedBy="tableau")
    private Achat transaction;
    
    @ManyToOne(optional=true)
    @JoinColumn(name="artiste_id")
    private Artiste artiste;
}
