package scanner;

public class Student {
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("I am a Student");
	}
	
	public Student(int id) {
		System.out.println("Student Id " +id);
	}
	
	public void Studentname(String name) {
		// TODO Auto-generated method stub
		System.out.println("Studemt name is " + name);

	}
	
	public static void main(String[] args) {
		Student s  = new Student();
		Student s1 = new Student(123);
		s.Studentname("Swathy");
		
	}

}
