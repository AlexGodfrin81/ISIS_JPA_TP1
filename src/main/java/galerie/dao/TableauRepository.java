package galerie.dao;

import galerie.entity.Tableau;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ALEX
 */
public interface TableauRepository extends JpaRepository<Tableau, Integer> {
    
}
