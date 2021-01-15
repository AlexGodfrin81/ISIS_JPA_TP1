/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Achat;
import galerie.entity.Personne;
import java.time.LocalDate;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ALEX
 */
public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    
    public default float budgetArt(int id, int annee){
        float res = 0f;
        Optional<Personne> pers = findById(id);
        for (Achat t : pers.get().getTransactions()){
            LocalDate d = t.getVendu_le();
            if (d.isAfter(LocalDate.of(annee, 1, 1)) && d.isBefore(LocalDate.of(annee, 12, 31))){
                res+=t.getPrix_vente();
            }
        }
        return res;
    }
    
}
