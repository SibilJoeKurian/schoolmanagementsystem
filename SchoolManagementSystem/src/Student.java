
public class Student {
	int id;
	String name;
	int grade;
	float feesPaid;
	float totalFees;

	/**
	 * This is used to initialize a student toalFees for a student for an year is
	 * 1000 feesPaid initially will be 0
	 * 
	 * @param id
	 * @param name
	 * @param i
	 */
	public Student(int id, String name, int i) {
		feesPaid = 0;
		totalFees = 1000;
		this.id = id;
		this.name = name;
		this.grade = i;
	}

	/**
	 * This is used to update the students grade
	 * 
	 * @param grade new grade of the student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * Keep adding the fees to the feesPaid
	 * 
	 * @param fees
	 */
	public void payFees(float fees) {
		feesPaid = feesPaid + fees;
	}

	/**
	 * 
	 * @return id of the student
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return name of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return grade of the student
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * 
	 * @return feesPaid by the student
	 */
	public float getFeesPaid() {
		return feesPaid;
	}

	public float getTotalFees() {
		return totalFees;
	}

	public static void main(String[] args) {
		System.out.print("Helloo");
	}
}
