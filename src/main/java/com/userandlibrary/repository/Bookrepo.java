package com.userandlibrary.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.userandlibrary.Entity.Books;
import com.userandlibrary.Entity.User;
@Repository
public interface Bookrepo extends JpaRepository<Books, Integer>{

//	@Query("SELECT b FROM Books b WHERE b.email = ?1 AND u.password = ?2")
//    Optional<User> findByUsernameAndPassword(String email, String password);
}
