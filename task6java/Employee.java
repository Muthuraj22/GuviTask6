package task6java;

public class Employee {
	//Fields
	private int Id;
	private String Firstname;
	private String Lastname;
	private int Salary;
	
	//Constructor
	public Employee (int Id, String Firstname, String Lastname, int Salary) {
		this.Id = Id;
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.Salary = Salary;
	}
	// Getter method
	public int getId(){
		return Id;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	
	public String getLastname() {
		return Lastname;
	}
	
	public int getSalary() {
		return Salary;
	}
	
	//Setter Method
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	
	//Annual Salary
	public int getAnnualSalary() {
		return Salary * 12;
	}
	
	//Raise Salary
	public int raiseSalary(int percent) {
		Salary = Salary+ (Salary*percent/100);
		return Salary;		
	}
	public String toString() {
		return "Employee[Id= "+Id+", First Name: "+Firstname+", Last Name: "+Lastname+", Salary: "+Salary+ "]";
	}
}
