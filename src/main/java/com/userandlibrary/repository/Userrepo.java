package com.userandlibrary.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.userandlibrary.Entity.User;

@Repository
public interface Userrepo extends JpaRepository<User, Integer>{

	@Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    Optional<User> findByUsernameAndPassword(String email, String password);
}
