package assignment.interfaceandpackage.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment.interfaceandpackage.university.courses.Course;
import assignment.interfaceandpackage.university.faculty.Faculty;
import assignment.interfaceandpackage.university.students.Student;

public class UniversityManagement {

	private Student student;
	private Course course;
	private Faculty faculty;
	
	public void add() {

		Scanner scanner = new Scanner(System.in);
		List<Student> studentList = new ArrayList<>();
		List<Faculty> facultyList = new ArrayList<>();
		List<Course> courseList = new ArrayList<>();

		System.out.println("enter, how many course add you wand? ");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= count; i++) {
			course = new Course();
			System.out.println("enter course" + i + " name");
			course.setName(scanner.nextLine());
			System.out.println("enter course" + i + " duration");
			course.setDuration(scanner.nextByte());
			System.out.println("enter course" + i + " studentCount");
			course.setStudentsCount(scanner.nextInt());
			courseList.add(course);
			System.out.println();
		}

		System.out.println("enter, how many faculty add you wand? ");
		count = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= count; i++) {
			faculty = new Faculty();
			System.out.println("enter faculty" + i + " name");
			faculty.setName(scanner.nextLine());
			System.out.println("enter faculty" + i + " departmentName");
			faculty.setDepartmentName(scanner.nextLine());
			faculty.setId(i);
			facultyList.add(faculty);
			System.out.println();
		}
		
		System.out.println("enter, how many student add you wand? ");
		count = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= count; i++) {
			student = new Student();
			System.out.println("enter student" + i + " name");
			student.setName(scanner.nextLine());
			System.out.println("enter student" + i + " departmentName");
			student.setDepartmentName(scanner.nextLine());
			student.setId(i);
			studentList.add(student);
			System.out.println();
		}
		

		print(courseList, facultyList, studentList);
		scanner.close();
	}
	
	public void print(List<Course> courseList, List<Faculty> facultyList, List<Student> studentList) {
		
		for (Course course : courseList) {
			System.out.println("----------------------------------");
			System.out.println("Course name: " + course.getName());
			System.out.println("Course duration: " + course.getDuration());
			System.out.println("course number of student: " + course.getStudentsCount());
		}

		System.out.println("----------------------------------");

		for (Faculty faculty : facultyList) {
			System.out.println("----------------------------------");
			System.out.println("faculty name: " + faculty.getName());
			System.out.println("faculty id: " + faculty.getId());
			System.out.println("faculty department: " + faculty.getDepartmentName());
		}

		System.out.println("----------------------------------");
		for (Student student : studentList) {
			System.out.println("----------------------------------");
			System.out.println("student name: " + student.getName());
			System.out.println("student id: " + student.getId());
			System.out.println("student department: " + student.getDepartmentName());
		}

		System.out.println("----------------------------------");
		
	}
	
	public static void main(String[] args) {
		
		UniversityManagement universityManagement=new UniversityManagement();
		
		universityManagement.add();
		
	}
}
