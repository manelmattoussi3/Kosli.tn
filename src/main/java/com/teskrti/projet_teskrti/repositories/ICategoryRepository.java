package com.teskrti.projet_teskrti.repositories;

import com.teskrti.projet_teskrti.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
