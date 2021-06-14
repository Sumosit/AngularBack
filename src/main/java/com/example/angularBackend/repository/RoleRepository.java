package com.example.angularBackend.repository;

import java.util.Optional;

import com.example.angularBackend.models.ERole;
import com.example.angularBackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
