package com.userandlibrary.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userandlibrary.Entity.Suggestbook;
import com.userandlibrary.repository.Suggestrepo;

@Service
public class Suggestservice {
    
	@Autowired
	private Suggestrepo repo;
	
	public void addSuggestbook(Suggestbook book) {
		
		repo.save(book);
	}
}
