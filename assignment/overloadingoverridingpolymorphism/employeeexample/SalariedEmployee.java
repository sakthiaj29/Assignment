package assignment.overloadingoverridingpolymorphism.employeeexample;

public class SalariedEmployee extends Employee{

	private String name;
	private long id;
	private double salary;

	public SalariedEmployee(String name, long id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("SalariedEmployee name:"+name+", id:"+id+", salary:"+salary);
	}
	
}
