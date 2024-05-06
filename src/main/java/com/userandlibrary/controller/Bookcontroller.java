package com.userandlibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.userandlibrary.Entity.Books;
import com.userandlibrary.Entity.User;
import com.userandlibrary.Service.BookService;
import com.userandlibrary.Service.Userservice;


@Controller
public class Bookcontroller {

	@Autowired
	private BookService serv;
	@Autowired
	private Userservice userserv;
	
	@GetMapping("/adminhome")
	public String getdata() {
		return "Adminpage";
	}

	@GetMapping("/book_register")
	public String BookRegister() {
		return "bookregister";
	}
	
	@PostMapping("/savebook")
	public String addBook(@ModelAttribute Books b) {
		serv.saveBook(b);
		return "redirect:/available_books";
	}
	@GetMapping("/available_books")
	public ModelAndView getAllBooks() {
		List<Books> res = serv.getAll();
		ModelAndView model=new ModelAndView("Availablebooks");
		model.addObject("book",res);
		return model;
	}
	@RequestMapping("/editBook/{id}")
	public ModelAndView EditBook(@PathVariable("id") int id) {
		Books b1 = serv.getBookById(id);
		ModelAndView m = new ModelAndView("Bookedit");
		m.addObject("book",b1);
		return m;
	}
	@RequestMapping("/deleteBookbyid/{id}")
	public String deletebookbyid(@PathVariable("id") int id) {
		serv.deletebyId(id);
		return "redirect:/available_books";
	}
	@GetMapping("getallusers")
	public String AllUsers(Model model) {
		List<User> allusers = userserv.getallUsers();
		model.addAttribute("alluser", allusers);
		return "Allusersinfo";
	}
	@RequestMapping("/deleteUserByid/{id}")
	public String deleteUserByid(@PathVariable("id")int id) {
		userserv.deleteuserByid(id);
		return "redirect:/getallUsers";
	}
	
	public Books getbyid(int id) {
		return serv.getBookbyId(id);
	}

}
