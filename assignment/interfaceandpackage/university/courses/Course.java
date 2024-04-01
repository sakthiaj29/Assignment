package assignment.interfaceandpackage.university.courses;

public class Course {

	private String name;
	private byte duration;
	private int studentsCount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getDuration() {
		return duration;
	}
	public void setDuration(byte duration) {
		this.duration = duration;
	}
	public int getStudentsCount() {
		return studentsCount;
	}
	public void setStudentsCount(int studentsCount) {
		this.studentsCount = studentsCount;
	}
	
}
