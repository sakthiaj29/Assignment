package assignment.synchronization.printer;

public class PrintTask implements Runnable {

	private Printer printer;
	private String documentName;

	public PrintTask(Printer printer, String documentName) {
		this.printer = printer;
		this.documentName = documentName;
	}

	public void run() {
		for (int loop = 0; loop < 5; loop++) {
			printer.printDocument(documentName);
		}
	}
}
