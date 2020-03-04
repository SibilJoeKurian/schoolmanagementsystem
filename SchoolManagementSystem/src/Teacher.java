
public class Teacher {
	int id;
	String name;
	float salary;

	/**
	 * creating new teacher
	 * 
	 * @param id     for teacher
	 * @param name   of the teacher
	 * @param salary of the teacher
	 */
	public Teacher(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	/**
	 * 
	 * @return salary of the teacher
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * Update the salary of the teacher
	 * 
	 * @param salary new salary
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * 
	 * @return id of the teacher
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return name of the teacher
	 */
	public String getName() {
		return name;
	}

}
