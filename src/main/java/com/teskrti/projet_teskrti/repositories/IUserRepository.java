package com.teskrti.projet_teskrti.repositories;

import com.teskrti.projet_teskrti.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Utilisateur,Long> {
}
