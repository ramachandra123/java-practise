package com.testqa.library;

public class Book {
    String bookId;
    String bookName;
    String bookAuthor;
    
    public Book(String bookId, String bookName, String bookAuthor ){
    	this.bookId = bookId;
    	this.bookName = bookName;
    	this.bookAuthor = bookAuthor;
    }
     public void bookDetails(){
    	 System.out.println(bookId);
    	 System.out.println(bookName);
    	 System.out.println(bookAuthor);
    	 
     }
    
    
}
