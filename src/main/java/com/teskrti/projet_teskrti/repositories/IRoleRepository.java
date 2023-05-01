package com.teskrti.projet_teskrti.repositories;

import com.teskrti.projet_teskrti.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
}
