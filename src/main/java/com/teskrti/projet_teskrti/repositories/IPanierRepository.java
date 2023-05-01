package com.teskrti.projet_teskrti.repositories;

import com.teskrti.projet_teskrti.entities.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPanierRepository extends JpaRepository<Panier,Long> {
}
