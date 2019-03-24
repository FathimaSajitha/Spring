package com.sgic.Librarysystem.controller;

import java.awt.print.Book;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.Librarysystem.services.BookServicesImp;

@RestController
public class BookController {
@Autowired
		BookServicesImp bookservice;
		
		
		
		@PostMapping("/savebook")
		public HttpStatus createbook (@Valid @RequestBody Book book) {
			bookservice.saveBook(book);
			return HttpStatus.CREATED;
		}
		
		@PostMapping("/getbook")
		public HttpResponseEntity <Book> getBookId(@PathVariable("bookid") String id) {
			return new ResponseEntity<>(bookservice.getBookById(id),HttpStatus.OK);
		}
	}

