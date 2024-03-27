package assignment.constructorsandnheritance.librarymanagmentclass;

import java.util.List;

public class LibraryManagementSystem {

	private String userType;
	private String userName;
	private String password;
	private List<User> userList;
	private List<Book> bookList;
	private Librarian librarin;

	public void login() {
		System.out.println("Login..");
	}

	public void register() {
		System.out.println("Register..");
	}

	public void logout() {
		System.out.println("Logout..");
	}
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
