package programs;

public class Staff extends Student_Data {

  @Override
void student_Hallticket() {
	// TODO Auto-generated method stub
	  System.out.println("Hall Ticket Number is 12345");
	
}
  public static void main(String[] args) {
	Staff s = new Staff();
	s.student_name();
	s.student_Hallticket();
}
}
