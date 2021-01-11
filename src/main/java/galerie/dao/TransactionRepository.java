package galerie.dao;

import galerie.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ALEX
 */
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    
}
