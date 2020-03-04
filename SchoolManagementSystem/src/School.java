import java.util.ArrayList;

public class School {
	private ArrayList<Teacher> teacher;
	private ArrayList<Student> student;
	private float totalMoneySpend;
	private float totalMoneyEarned;

	public School(ArrayList<Teacher> teacher, ArrayList<Student> student) {
		this.teacher = teacher;
		this.student = student;
		totalMoneyEarned = 0;
		totalMoneySpend = 0;
	}

	/**
	 * 
	 * @return teacher list
	 */
	public ArrayList<Teacher> getTeacher() {
		return teacher;
	}

	/**
	 * Add a new teacher to the school
	 * 
	 * @param teacher the teacher to be added
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher.add(teacher);

	}

	/**
	 * 
	 * @return the list of students
	 */
	public ArrayList<Student> getStudent() {
		return student;
	}

	/**
	 * Add a new student to the school
	 * 
	 * @param student the student to be added
	 */
	public void addStudent(Student student) {
		this.student.add(student);
	}

	/**
	 * 
	 * @return the total money earned
	 */
	public float getTotalMoneySpend() {
		return totalMoneySpend;
	}

	/**
	 * Salary given by the school
	 * 
	 * @param totalMoneySpend
	 */
	public void updateTotalMoneySpend(float moneySpend) {
		totalMoneySpend -=moneySpend;
	}

	/**
	 * Total money earned by the school
	 * 
	 * @return
	 */
	public float getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the total money earned by the school
	 * 
	 * @param totalMoneyEarned
	 */
	public void setTotalMoneyEarned(float moneyEarned) {
		this.totalMoneyEarned += moneyEarned;
	}

}
