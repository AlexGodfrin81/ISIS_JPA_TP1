package galerie.dao;

import galerie.entity.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.PersonneRepository;
/**
 *
 * @author ALEX
 */
@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class PersonneRepositoryTest {
    
    @Autowired
    private PersonneRepository persDao;
    
    @Test
    @Sql("test-data.sql") // On peut charger des donnnées spécifiques pour un test
    public void onSaitCompterLesEnregistrements() {
        log.info("On compte les enregistrements de la table 'Personne'");
        int combienDansLeJeuDeTest = 1; 
        long nombre = persDao.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "On doit trouver 1 personne" );
    }
    
}
