package assignment.synchronization.printer;

public class Printer {

	public void printDocument(String documentName) {
	    synchronized (this) {
	        System.out.println("Print : " + documentName);
	        try {
	            Thread.sleep(2000); 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
}
