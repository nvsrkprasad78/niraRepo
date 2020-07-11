package java8;

import java.util.HashMap;

class Employee{
	int empid;
	String empName;
	
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empid != other.empid)
			return false;
		return true;
	}
	
	
}
public class EqualsAndHashcode {

	public EqualsAndHashcode() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1, "ccc");
		Employee e2 = new Employee(1, "ccc");
		
		HashMap<Employee, String> testMap = new HashMap<>();
		testMap.put(e1, "bbb");
		testMap.put(e2, "ccc");
		
		System.out.println("size : " + testMap.size());
	}

}
