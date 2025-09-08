package program6;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e2) {

		Employee e1 = this;
		String name1 = e1.name;
		String name2 = e2.name;

		if (name1.equals(name2) == true) {

			Integer id1 = e1.id;
			Integer id2 = e2.id;

			return id1.compareTo(id2);
		} else {
			return name1.compareTo(name2);

		}
	}

}
