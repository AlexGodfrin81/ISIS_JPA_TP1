package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ALEX
 */
public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
    
}
