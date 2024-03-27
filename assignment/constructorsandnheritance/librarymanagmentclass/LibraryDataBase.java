package assignment.constructorsandnheritance.librarymanagmentclass;

import java.util.List;

public class LibraryDataBase {

	private List<Book> bookList;

	public void add(Book book) {
		bookList.add(book);
	}

	public void delete(Book book) {
		bookList.remove(book);
	}

	public void update() {

	}

	public void display() {

	}

	public void search(String name) {

	}
}
