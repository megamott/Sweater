package com.example.sweater.repos;

import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Matvey
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
