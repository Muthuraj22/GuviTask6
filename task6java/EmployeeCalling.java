package task6java;

public class EmployeeCalling {
	
	public static void main(String[] args) {
	Employee Emp1 = new Employee(01,"Harish", "Krishna", 5000);
	Employee Emp2 = new Employee(02,"Subash", "Subs", 50000);
	Employee Emp3 = new Employee(03,"Dinesh", "Kumar", 15000);
	
	System.out.println(Emp1.getSalary());
	System.out.println(Emp1.toString());
	System.out.println("Annual Salary: " +Emp1.getAnnualSalary());
	System.out.println("New Salary after 10% raise: " +Emp1.raiseSalary(10));
	System.out.println(Emp1.getSalary());
	
	System.out.println(Emp2.getSalary());
	System.out.println(Emp2.toString());
	System.out.println("Annual Salary: " +Emp2.getAnnualSalary());
	System.out.println("New Salary after 20% raise: " +Emp2.raiseSalary(20));
	System.out.println(Emp2.getSalary());
	
	System.out.println(Emp3.getSalary());
	System.out.println(Emp3.toString());
	System.out.println("Annual Salary: "+Emp3.getAnnualSalary());
	System.out.println("New Salary ster 5% raise: "+Emp3.raiseSalary(5));
	System.out.println(Emp3.getSalary());
	}
	
}
