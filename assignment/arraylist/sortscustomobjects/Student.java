package assignment.arraylist.sortscustomobjects;

public class Student {

	private String name;
	private long id;
	private double mark;
	
	Student(String name,long id,double mark){
		this.name=name;
		this.id=id;
		this.mark=mark;
	}
	
	public String getName() {
		return name;
	}
	
	public long getId() {
		return id;
	}
	
	public double getMark() {
		return mark;
	}

}
