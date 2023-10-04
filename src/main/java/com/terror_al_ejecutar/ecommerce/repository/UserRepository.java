package com.terror_al_ejecutar.ecommerce.repository;

import com.terror_al_ejecutar.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
