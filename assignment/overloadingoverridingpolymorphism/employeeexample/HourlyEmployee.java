package assignment.overloadingoverridingpolymorphism.employeeexample;

public class HourlyEmployee extends Employee{

	private String name;
	private long id;
	private double salary;

	public HourlyEmployee(String name, long id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee name:"+name+", id:"+id+", salary:"+salary);
	}
	
}
