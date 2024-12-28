package com.app.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.springboot.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

//	@Query("Select B from com.app.springboot.entity.Book B")
//	@Query("select B from Book B") // package name is optional
	@Query("From Book") // start at FROM + Alias is optional
	public List<Book> getAllBooks();
	
	
//	@Query("select B.bookName From Book B")
	@Query("select bookName from Book")
	public List<String> getAllBookNames();
	
	@Query("select bookName,bookCost from Book")
	public List<Object[]> getNameAndCost();
	
	@Query("select B from Book B where B.bookName=?1 OR B.bookCost=?2") //positional Custom Query
	public List<Book> getDataA(String bname,Double bcost);
	
	@Query("Select B from Book B where B.bookName=:bname OR B.bookCost=:bcost") //Named Custom Query
	public List<Book> getDataB(String bname, Double bcost);
	
	@Query("select B.bookName from Book B where B.bookAuthor=:auth")
	public List<String> getDataC(String auth);
	
	@Query("select B.bookType, Count(B.bookType) from Book B Group By B.bookType having B.bookType!=:name")
	public List<Object[]> getDataD(String name);
	
	@Query("select MIN(B.bookCost), MAX(B.bookCost),AVG(B.bookCost) from Book B where B.bookAuthor=?1")
	public List<Object []> getDataE(String bookAuthor);
}
