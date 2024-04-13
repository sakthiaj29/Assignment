package assignment.arraylist.sortscustomobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {

	public static StudentMain studentMain;
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> studentList = new ArrayList<>();
	private byte NAME = 1;
	private byte ID = 2;
	private byte MARK = 3;
	private byte EXIT = 0;

	static StudentMain getStudentMainIntance() {

		if (studentMain == null) {
			studentMain = new StudentMain();
		}
		return studentMain;
	}

	public void init() {

		System.out.println("\nSort By Student\n 1 -> Name\n 2 -> Id\n 3 -> Mark\n 0 -> Exit\n");
		System.out.print(" Enter option: ");
		byte option = scanner.nextByte();

		if (option == NAME) {

			Collections.sort(studentList, new NameComparator());
			display(studentList);
		} 
		else if (option == ID) {

			Collections.sort(studentList, new IdComparator());
			display(studentList);
		} 
		else if (option == MARK) {

			Collections.sort(studentList, new MarkComparator());
			display(studentList);
		} 
		else if (option == EXIT) {

			System.exit(option);
		} 
		else {

			System.out.println(" Invalid option, Please enter valid option");
			init();
		}
	}

	public void add() {

		studentList.add(new Student("Balaji", 1, 1199.0));
		studentList.add(new Student("Santhosh", 5, 1200.0));
		studentList.add(new Student("Naveen", 2, 1200.2));
		studentList.add(new Student("Arumugam", 3, 1198.0));
		studentList.add(new Student("Dinesh", 6, 1200.5));
		studentList.add(new Student("Elavarasan", 4, 1195.0));
		studentList.add(new Student("Krithika", 1, 1199.0));

	}

	public void display(ArrayList<Student> studentList) {

		System.out.printf("\n\t%-15s\t %-5s\t %s", "Name", "Id", "Mark");
		System.out.println("\n\t--------------------------------");
		for (Student student : studentList) {
			System.out.printf("\t%-15s\t %-5s\t %s", student.getName(), student.getId(), student.getMark());
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		StudentMain.getStudentMainIntance().add();

		StudentMain.getStudentMainIntance().init();

	}

}
