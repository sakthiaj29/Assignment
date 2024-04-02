package assignment.abstractclassesandabstractmethods.employee;

abstract class Employee {

	protected String name;
	protected long id;
	protected double salary;
	
	Employee(String name, long id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public String displayEmployeeDetails() {
		return "\n Name: "+name+"\n Id: "+id+"\n Salary: "+salary;
	}
	
	abstract double calculatePay();

}
