package assignment.arraylist.circularbuffer;

import java.util.ArrayList;
import java.util.Scanner;

public class CircularBuffer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter capacity");
		int capacity = scanner.nextInt();
		ArrayList<String> circularBuffer = new ArrayList<String>(capacity);

		System.out.println("Enter number of message you want add");
		int length = scanner.nextInt();
		scanner.nextLine();

		for (int index = 0; index < length; index++) {

			System.out.println("Enter message");
			String message = scanner.nextLine();

			if (capacity <= index) {
				circularBuffer.set(index % capacity, message);
			} else {
				circularBuffer.add(message);
			}
		}
		System.out.println("\n" + circularBuffer);
		scanner.close();
	}

}
