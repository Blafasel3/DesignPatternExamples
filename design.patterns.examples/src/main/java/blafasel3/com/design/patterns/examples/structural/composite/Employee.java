package blafasel3.com.design.patterns.examples.structural.composite;

import java.util.HashSet;
import java.util.Set;

/**
 * Example found on
 * https://www.tutorialspoint.com/design_pattern/composite_pattern.htm
 *
 */
public class Employee {

	private String name;
	private String department;
	private double salary;
	private Set<Employee> subordinates = new HashSet<Employee>();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]" + "\nSubordinates: "
				+ this.subordinates.stream().map((Employee employee) -> employee.name)
						.reduce((String str1, String str2) -> str1 + ", " + str2).orElse("None");
	}

	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public void addSubordinate(Employee subordinate) {
		this.subordinates.add(subordinate);
	}

	public void removeSubordinate(Employee subordinate) {
		this.subordinates.remove(subordinate);
	}

	public Set<Employee> getSubordinates() {
		return this.subordinates;
	}

	public String getName() {
		return this.name;
	}

}
