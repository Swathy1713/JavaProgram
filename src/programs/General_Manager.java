package programs;

public class General_Manager implements Employee_Details {

	@Override
	public void employee_Name() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name is Swathy");
	}
	
	@Override
	public void employee_ID() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id is 793691");		
	}
	
	@Override
	public void employee_Salary() {
		// TODO Auto-generated method stub
		System.out.println("Employee Salary is 20000");
		
	}
public static void main(String[] args) {
	General_Manager gm = new General_Manager();
	gm.employee_Name();
	gm.employee_ID();
	gm.employee_Salary();
}
}
