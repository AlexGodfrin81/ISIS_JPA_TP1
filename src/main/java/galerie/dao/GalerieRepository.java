package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Galerie;
import java.time.LocalDate;
import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring 

public interface GalerieRepository extends JpaRepository<Galerie, Integer> {
    
    public default float CAannuel(int id, int annee){
        float res = 0;
        Optional<Galerie> gal = findById(id);
        for (Exposition e : gal.get().getExpositions()){
            LocalDate d = e.getDebut();
            if (d.isAfter(LocalDate.of(annee, 1, 1)) && d.isBefore(LocalDate.of(annee, 12, 31))){
                //res+=e.CA();
            }
        }
        return res;
    }
    
}
