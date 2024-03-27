package assignment.constructorsandnheritance.librarymanagmentclass;

import java.util.List;

public class User {

	private String name;
	private long id;
	private List<Book> bookList;
	private LibraryManagementSystem libraryManagementSystem;
	private Account account;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void verify() {
		System.out.println("Verify..");
	}
	public void checkAccount() {
		System.out.println("Account check..");
	}
	
}
