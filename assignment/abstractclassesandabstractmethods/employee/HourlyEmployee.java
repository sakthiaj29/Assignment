package assignment.abstractclassesandabstractmethods.employee;

public class HourlyEmployee extends Employee{

	private int totalHour;

	public HourlyEmployee(String name, long id, double salary, int totalHour) {
		super(name, id, salary);
		this.totalHour=totalHour;
	}
	
	public String displayEmployeeDetails() {
		return "\n Name: "+name+"\n Id: "+id+"\n Salary: "+salary+"\n Total Hour: "+totalHour;
	}

	@Override
	double calculatePay() {
		return totalHour*salary;
	}
	
}
