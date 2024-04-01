package assignment.interfaceandpackage.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment.interfaceandpackage.library.book.Book;
import assignment.interfaceandpackage.library.members.Member;

public class LibraryManagement {

	private Book book;
	private Member member;

	public void add() {

		Scanner scanner = new Scanner(System.in);
		List<Book> bookList = new ArrayList<>();
		List<Member> memberList = new ArrayList<>();

		System.out.println("enter, how many book add you wand? ");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= count; i++) {
			book = new Book();
			System.out.println("enter book" + i + " name");
			book.setName(scanner.nextLine());
			System.out.println("enter book" + i + " author");
			book.setAuthor(scanner.nextLine());
			System.out.println("enter book" + i + " genre");
			book.setGenre(scanner.nextLine());
			bookList.add(book);
			System.out.println();
		}

		System.out.println("enter, how many member add you wand? ");
		count = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= count; i++) {
			member = new Member();
			System.out.println("enter member" + i + " name");
			member.setName(scanner.nextLine());
			System.out.println("enter member" + i + " emailId");
			member.setEmailId(scanner.nextLine());
			System.out.println("enter member" + i + " password");
			member.setPassword(scanner.nextLine());
			memberList.add(member);
			System.out.println();
		}

		print(bookList, memberList);
		scanner.close();
	}

	public void print(List<Book> bookList, List<Member> memberList) {

		for (Book book : bookList) {
			System.out.println("----------------------------------");
			System.out.println("Book name: " + book.getName());
			System.out.println("Book author: " + book.getAuthor());
			System.out.println("Book genre: " + book.getGenre());
		}

		System.out.println("----------------------------------");

		for (Member member : memberList) {
			System.out.println("----------------------------------");
			System.out.println("Member name: " + member.getName());
			System.out.println("Member email: " + member.getEmailId());
		}

		System.out.println("----------------------------------");
	}

	public static void main(String[] args) {

		LibraryManagement libraryManagement = new LibraryManagement();

		libraryManagement.add();
	}

}
