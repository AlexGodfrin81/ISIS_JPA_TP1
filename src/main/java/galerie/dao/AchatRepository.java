package galerie.dao;

import galerie.entity.Achat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ALEX
 */
public interface AchatRepository extends JpaRepository<Achat, Integer> {
    
}
