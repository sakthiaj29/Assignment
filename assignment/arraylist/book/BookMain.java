package assignment.arraylist.book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	private static BookMain bookMain;
	private byte ADD_BOOK=1;
	private byte UPDATE_BOOK=2;
	private byte DELETE_BOOK=3;
	private byte VIEW_BOOK=4;
	private byte EXIT=0;
	private ArrayList<Book> bookList=new ArrayList<>();
	private String primaryPassword="sakthi";
	private Book book;
	
	private Scanner scanner=new Scanner(System.in);
	public static BookMain getInstanceBookMain() {
		if(bookMain==null) {
			bookMain=new BookMain();
		}
		return bookMain;
	}
	public static void main(String[] args) {
		BookMain.getInstanceBookMain().init();
	}
	public void init() {
		
		System.out.println(" 1 -> Add Book\n 2 -> Update Book\n 3 -> Delete Book\n 4 -> View Books\n 0 -> Exit\n");
		System.out.print("Enter your option: ");
		byte option=scanner.nextByte();
		if(option==ADD_BOOK) {
			onAddBook();
		}
		else if(option==UPDATE_BOOK) {
			onUpdateBook();
		}
		else if(option==DELETE_BOOK) {
			onDeleteBook();
		}
		else if(option==VIEW_BOOK) {
			onViewBook();
		}
		else if(option==EXIT) {
			
		}
		else {
			System.out.println("\nInvalid option, please enter valid option");
			init();
		}
		
	}
	private void onViewBook() {
		System.out.printf("%-20s\t %-10s\t %-10s\t %s","Book Name", "Author", "Genre", "Price");
		System.out.println("\n------------------------------------------------------------------------------------");
		for(Book book:bookList) {
			System.out.printf("%-20s\t %-10s\t %-10s\t %s",book.getBookName(), book.getAuthor(), book.getGenre(), book.getPrice());
			System.out.println();
		}
		init();
	}
	private void onDeleteBook() {
		System.out.println("Enter Book name");
		String name=scanner.nextLine();
		
		for(int i=0;i<bookList.size();i++) {
			if(name.equals( bookList.get(i).getBookName() )) {
				bookList.remove(i);
				System.out.println("Book removed Successful");
				break;
			}
		}
		init();
	}
	public void onUpdateBook() {

		System.out.println("\nEnter password");
		String password = scanner.next();

		if (primaryPassword.equals(password)) {
			
			if(bookList.size()<=0) {
				System.out.println(".............................. No Data fount :(");
				init();
			}
			System.out.println("Enter book name for update");
			String oldName=scanner.nextLine();
			scanner.nextLine();
			
			for(Book books:bookList) {
				if(oldName.equals(books.getBookName())) {
					book=books;
				}
			}
			if(book==null) {
				System.out.println("Invalid Book!");
				init();
			}
			
			System.out.println("\n 1 -> Update Name\n 2 -> Update Author\n 3 -> Update Genre\n 0 -> Exit");
			System.out.print("\nEnter option: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				
				System.out.println("\n Enter name: ");
				String name = scanner.nextLine();
				book.setBookName(name);
				System.out.println("\nUpdate Book successfully");
				init();
				
			} else if (option == 2) {
				
				System.out.println("\n Enter author: ");
				String author = scanner.nextLine();
				book.setAuthor(author);
				System.out.println("\nUpdate Book successfully");
				init();
				
			} else if (option == 3) {
				
				System.out.println("\n Enter genre: ");
				String genre = scanner.nextLine();
				book.setGenre(genre);
				System.out.println("\nUpdate Book successfully");
				init();
				
			} else if (option == 0) {
				System.exit(0);
			} else {
				onUpdateBook();
			}
		}
	}
	
	private void onAddBook() {
		System.out.println("Enter book name");
		String name=scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter book author");
		String author=scanner.nextLine();
		System.out.println("Enter book genre");
		String genre=scanner.nextLine();
		System.out.println("Enter book price");
		double price=scanner.nextDouble();
		scanner.nextLine();
		book=new Book(name, author, genre, price);
		bookList.add(book);
		System.out.println("........................ "+book.getBookName()+" added successfully.");
		init();
	}

}
