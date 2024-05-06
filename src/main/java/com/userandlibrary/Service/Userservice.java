package com.userandlibrary.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userandlibrary.Entity.User;
import com.userandlibrary.repository.Userrepo;
@Service
public class Userservice {

	@Autowired
	private Userrepo repo;
	public User login(String email,String password) {
		
		Optional<User> res = repo.findByUsernameAndPassword(email, password);
		return res.get();
	}
	public User saveUser(User user) {
		User res = repo.save(user);
		return res;
	}
	public List<User> getallUsers(){
		
		List<User> all = repo.findAll();
		return all;
	}
	public void deleteuserByid(int id) {
		repo.deleteById(id);
	}
}
