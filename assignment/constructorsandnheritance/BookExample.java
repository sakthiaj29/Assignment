package assignment.constructorsandnheritance;

import java.util.Scanner;

public class BookExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of book you want add");
		int length=scanner.nextInt();
		scanner.nextLine();
		String name,isbn,author,genre;
		double price;
		Book[] arrayOfBooks=new Book[length];
		for(int i=0;i<length;i++) {
			System.out.println("Enter book"+(i+1)+" name");
			name=scanner.nextLine();
			System.out.println("Enter book"+(i+1)+" isbn");
			isbn=scanner.nextLine();
			System.out.println("Enter book"+(i+1)+" author");
			author=scanner.nextLine();
			System.out.println("Enter book"+(i+1)+" genre");
			genre=scanner.nextLine();
			System.out.println("Enter book"+(i+1)+" price");
			price=scanner.nextDouble();
			scanner.nextLine();
			arrayOfBooks[i]=new Book(name, isbn, author, genre, price);
			System.out.println();
		}
		System.out.printf("%-20s\t %-10s\t %-10s\t %-10s\t %s","Book Name", "ISBN", "Author", "Genre", "Price");
		System.out.println("\n------------------------------------------------------------------------------------");
		for(Book book:arrayOfBooks) {
			System.out.printf("%-20s\t %-10s\t %-10s\t %-10s\t %s",book.getBookName(), book.getBookIsbn(), book.getAuthor(), book.getGenre(), book.getPrice());
			System.out.println();
		}
		scanner.close();
	}

}
class Book {

	private static String libraryName="ABCD library";
	private String name;
	private String isbn;
	private String author;
	private String genre;
	private double price;

	Book(String name, String isbn, String author, String genre, double price){
		this.name=name;
		this.isbn=isbn;
		this.author=author;
		this.genre=genre;
		this.price=price;
	}
	
	public String getBookName() {
		return name;
	}

	public String getBookIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public static String getLibraryName() {
		return libraryName;
	}

	public double getPrice() {
		return price;
	}

}

