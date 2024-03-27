package assignment.objectandclass;

 class Book {

	private static String libraryName="ABCD library";
	private String bookName;
	private String bookIsbn;
	private String author;
	private String genre;
	private String publication;
	private boolean isAvilable;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public boolean isAvilable() {
		return isAvilable;
	}

	public void setAvilable(boolean isAvilable) {
		this.isAvilable = isAvilable;
	}

	public static String getLibraryName() {
		return libraryName;
	}

}
