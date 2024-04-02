package assignment.abstractclassesandabstractmethods.employee;

public class SalariedEmployee extends Employee{

	private int totalMonth;

	public SalariedEmployee(String name, long id, double salary, int totalMonth) {
		super(name, id, salary);
		this.totalMonth=totalMonth;
	}
	
	public String displayEmployeeDetails() {
		return "\n Name: "+name+"\n Id: "+id+"\n Salary: "+salary+"\n Total Month: "+totalMonth;
	}

	@Override
	double calculatePay() {
		return totalMonth*salary;
	}
	
}
