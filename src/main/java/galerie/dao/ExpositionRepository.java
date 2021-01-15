package galerie.dao;

import galerie.entity.Achat;
import galerie.entity.Exposition;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ALEX
 */
public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
    
    public default float CA(int id){
        Optional<Exposition> expo = findById(id);
        float res = 0f;
        if (expo.isPresent()){
            for (Achat t : expo.get().getTransactions()){
                res+=t.getPrix_vente();
            }
        }
        return res;
    }

}
