package scanner;

public class Employee {
	//non parameterized constructor
	public Employee() {
		// TODO Auto-generated method stub
		System.out.println("Employee");

	}
	// Parameterized constructor
	public Employee(int id) {
		// TODO Auto-generated method stub
		System.out.println("Employee Id " +id);

	}
	
	public static void employe(String name) {
		System.out.println("Employee Name : " +name);

	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee ee = new Employee(123);
		ee.employe("Swathy");
		
	}
}
