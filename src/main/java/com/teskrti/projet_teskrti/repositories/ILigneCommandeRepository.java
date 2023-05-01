package com.teskrti.projet_teskrti.repositories;


import com.teskrti.projet_teskrti.entities.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILigneCommandeRepository extends JpaRepository<LigneCommande,Long> {
}
