package assignment.interfaceandpackage.library.book;

public class Book {

	private String name;
	private long id;
	private String author;
	private String genre;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public String toString() {
		return name + " " + id+ " " +author;
	}
}
