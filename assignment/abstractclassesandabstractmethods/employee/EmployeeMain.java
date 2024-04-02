package assignment.abstractclassesandabstractmethods.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	private List<Employee> employeeList=new ArrayList<>();
	
	public void add() {
		Employee hourlyEmployee =new HourlyEmployee("Balasubramanian", 1045, 120.0, 350); 
		employeeList.add(hourlyEmployee);
		
		Employee salariedEmployee =new SalariedEmployee("Sakthi",1278, 500.0, 10); 
		employeeList.add(salariedEmployee);
		
		display();
		
		totalPay();
	}
	
	private void totalPay() {
		
		double totalAmount=0.0;
		for(Employee employee:employeeList) {
			totalAmount+=employee.calculatePay();
		}
		System.out.println("\n\tTotal pay: "+totalAmount);
		
	}

	private void display() {
	
		System.out.println("\tEmployee Details");
		for(Employee employee:employeeList) {
			System.out.println("-------------------------------------");
			System.out.println( employee.displayEmployeeDetails() );
			System.out.println("\n Total Salary: "+employee.calculatePay());
		}
		
		System.out.println("-------------------------------------");
	}
	public static void main(String[] args) {
		
		EmployeeMain employeeMain=new EmployeeMain();
		
		employeeMain.add();
	}

}
