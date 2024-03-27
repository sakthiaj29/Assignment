package assignment.overloadingoverridingpolymorphism.employeeexample;

public class EmployeeExample {

	public static void main(String[] args) {
		
		Employee hourlyEmployee =new HourlyEmployee("Balasubramanian", 10, 120000.0); 
		hourlyEmployee.displayEmployeeDetails();
		
		Employee salariedEmployee =new SalariedEmployee("sakthi", 10, 12000.0); 
		salariedEmployee.displayEmployeeDetails();
	}

}
