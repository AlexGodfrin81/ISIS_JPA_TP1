package galerie.entity;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;
// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Galerie {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    @OneToMany(mappedBy = "galerie")
    private List<Exposition> expositions = new LinkedList<>();
    
    public float CAannuel(int annee){
        float res = 0;
        for (Exposition e : expositions){
            LocalDate d = e.getDebut();
            if (d.isAfter(LocalDate.of(annee, 1, 1)) && d.isBefore(LocalDate.of(annee, 12, 31))){
                res+=e.CA();
            }
        }
        return 0f;
    }
    
}
