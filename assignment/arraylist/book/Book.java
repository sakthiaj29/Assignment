package assignment.arraylist.book;

class Book {

	private static String libraryName="ABCD library";
	private String name;
	private String author;
	private String genre;
	private double price;

	Book(String name, String author, String genre, double price){
		this.name=name;
		this.author=author;
		this.genre=genre;
		this.price=price;
	}
	
	public String getBookName() {
		return name;
	}

	public void setBookName(String name) {
		this.name=name;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre=genre;
	}
	
	public static String getLibraryName() {
		return libraryName;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}

}
