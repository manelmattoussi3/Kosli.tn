package com.teskrti.projet_teskrti.repositories;

import com.teskrti.projet_teskrti.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactRepository extends JpaRepository<Contact,Long> {
}

