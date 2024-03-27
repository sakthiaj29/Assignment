package assignment.constructorsandnheritance.librarymanagmentclass;

import java.util.List;

public class Librarian {

	private String name;
	private long id;
	private String password;
	private String searchString;
	private List<Book> bookList;
	private LibraryManagementSystem libraryManagementSystem;
	private LibraryDataBase libraryDataBase;
	
	public void verifyLibrarian() {
		
	}
	public void search() {
		
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

}
