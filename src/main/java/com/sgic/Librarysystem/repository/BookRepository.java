package com.sgic.Librarysystem.repository;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String > {
	Book findBookById(String bookid);
	
	

}
