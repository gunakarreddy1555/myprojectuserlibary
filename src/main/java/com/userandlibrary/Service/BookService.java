package com.userandlibrary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userandlibrary.Entity.Books;
import com.userandlibrary.repository.Bookrepo;

@Service
public class BookService {

	@Autowired
	private Bookrepo repo;
	public void saveBook(Books book) {
		 repo.save(book);
		
	}
	public List<Books> getAll(){
		List<Books> all = repo.findAll();
		return all;
	}
	public Books getBookById(int id) {
		return repo.findById(id).get();
	}
	public void deletebyId(int id) {
		repo.deleteById(id);
	}
	public Books getBookbyId(int id) {
		return repo.findById(id).get();
	}
}
