package assignment.constructorsandnheritance;

public class StudentExample {

	public static void main(String[] args) {
		Student student=new Student("Partha");
		System.out.println("Student name "+student.getName());
		
		ZSGSStudent zsgsStudent=new ZSGSStudent("Sakthi","Nandha");
		System.out.println("ZSGSStudent "+zsgsStudent.getName()+" and Mentor "+zsgsStudent.getMentorName());
	}
}
 class Student {

	String name;
	
	public Student(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class ZSGSStudent extends Student {
	String mentor;

	public ZSGSStudent(String name, String mentor) {
		super(name);
		this.mentor=mentor;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMentorName() {
		return name;
	}

}