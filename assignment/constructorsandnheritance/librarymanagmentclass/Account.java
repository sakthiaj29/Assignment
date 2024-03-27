package assignment.constructorsandnheritance.librarymanagmentclass;

public class Account {

	private int numberOfBorrowedBooks;
	private int numberOfReservedBooks;
	private int numberOfReturnBooks;
	private int numberOfLostBooks;
	private int fineAccount;
	private LibraryDataBase libraryDataBase;
	
	public void calculateFine() {
		
	}
	
	public int getNumberOfBorrowedBooks() {
		return numberOfBorrowedBooks;
	}

	public void setNumberOfBorrowedBooks(int numberOfBorrowedBooks) {
		this.numberOfBorrowedBooks = numberOfBorrowedBooks;
	}

	public int getNumberOfReservedBooks() {
		return numberOfReservedBooks;
	}

	public void setNumberOfReservedBooks(int numberOfReservedBooks) {
		this.numberOfReservedBooks = numberOfReservedBooks;
	}

	public int getNumberOfReturnBooks() {
		return numberOfReturnBooks;
	}

	public void setNumberOfReturnBooks(int numberOfReturnBooks) {
		this.numberOfReturnBooks = numberOfReturnBooks;
	}

	public int getNumberOfLostBooks() {
		return numberOfLostBooks;
	}

	public void setNumberOfLostBooks(int numberOfLostBooks) {
		this.numberOfLostBooks = numberOfLostBooks;
	}

	public int getFineAccount() {
		return fineAccount;
	}

	public void setFineAccount(int fineAccount) {
		this.fineAccount = fineAccount;
	}
}
