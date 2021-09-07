package com.devsuperior.bds03.repositories;

import com.devsuperior.bds03.entities.Department;
import com.devsuperior.bds03.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String username);
}
