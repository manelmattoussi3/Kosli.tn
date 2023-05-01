package com.teskrti.projet_teskrti.repositories;
import com.teskrti.projet_teskrti.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEvenementRepository extends JpaRepository<Evenement,Long> {
}
