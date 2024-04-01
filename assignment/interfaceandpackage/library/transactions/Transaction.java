package assignment.interfaceandpackage.library.transactions;

import assignment.constructorsandnheritance.librarymanagmentclass.Book;

public class Transaction {

	private long id;
	private Book book;
	private String emailId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
