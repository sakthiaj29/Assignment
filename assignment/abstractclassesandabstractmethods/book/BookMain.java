package assignment.abstractclassesandabstractmethods.book;

import java.util.Scanner;

public class BookMain {

	private Book book = new Book();
	private String primaryPassword = "adminSakthi";
	private Scanner scanner = new Scanner(System.in);

	public void updateBook() {

		System.out.println("\nEnter password");
		String password = scanner.nextLine();

		if (primaryPassword.equals(password)) {
			
			System.out.println("\n 1 -> Update Name\n 2 -> Update Author\n 3 -> Update Genre\n 0 -> Exit");
			System.out.print("\nEnter option: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				
				System.out.println("\n Enter name: ");
				String name = scanner.nextLine();
				book.setBookName(name);
				System.out.println("\nUpdate Book successfully");
				
			} else if (option == 2) {
				
				System.out.println("\n Enter author: ");
				String author = scanner.nextLine();
				book.setAuthor(author);
				System.out.println("\nUpdate Book successfully");
				
			} else if (option == 3) {
				
				System.out.println("\n Enter genre: ");
				String genre = scanner.nextLine();
				book.setGenre(genre);
				System.out.println("\nUpdate Book successfully");
				
			} else if (option == 0) {
				System.exit(0);
			} else {
				updateBook();
			}
		}
	}

	private void addBook() {

		book.setBookName("Harry Potter");
		book.setBookIsbn("343-3443-22-2");
		book.setAuthor("J.K.rowling");
		book.setGenre("Noval");

	}

	void init() {

		addBook();

		System.out.println("\n 1 -> Update Book\n 2 -> Exit\n");
		System.out.print("Enter option: ");
		byte option = scanner.nextByte();
		scanner.nextLine();

		if (option == 1) {
			updateBook();
		} else if (option == 2) {
			System.exit(0);
		} else {
			init();
		}

	}

	public static void main(String[] args) {

		BookMain bookMain = new BookMain();

		bookMain.init();
		;

	}

}
