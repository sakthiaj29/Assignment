package assignment.synchronization.printer;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer();
        Thread thread1 = new Thread(new PrintTask(printer, "document-1"));
        Thread thread2 = new Thread(new PrintTask(printer, "document-2"));
        Thread thread3 = new Thread(new PrintTask(printer, "document-3"));
        Thread thread4 = new Thread(new PrintTask(printer, "document-4"));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
	}
}
