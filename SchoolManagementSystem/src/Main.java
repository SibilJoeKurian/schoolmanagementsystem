import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1, "lizzy", 3000);
		Teacher mellisa = new Teacher(2, "melissa", 4000);
		Teacher jade = new Teacher(3, "jade", 5000);
		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		teacher.add(lizzy);
		teacher.add(mellisa);
		teacher.add(jade);
		Student s1 = new Student(1, "s1", 4);
		Student s2 = new Student(2, "s2", 5);
		Student s3 = new Student(3, "s3", 6);
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		School mount=new School(teacher,student);
		s1.payFees(1000);
		System.out.println("Total money earned by the school "+mount.getTotalMoneyEarned());
		
	}
}
