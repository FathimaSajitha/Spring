package com.sgic.Librarysystem.services;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;

import com.sgic.Librarysystem.dto.BookData;
import com.sgic.Librarysystem.repository.BookRepository;

public class BookServ implements BookServicesImp{

@Autowired
	
	BookRepository bookrepository;

	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		bookrepository.save(book);
	}
	@Override
	public BookData getBookById (String id) {
		BookData bookdata= new BookData()
				
		return bookrepository.findBookById(id);
		
	}

	

}
