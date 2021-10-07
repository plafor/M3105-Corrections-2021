package creation.prototype;

public class Employee implements Cloneable {

	private int empoyeeId;
	private String employeeName;
	private Department department;

	public Employee(int id, String name, Department dept) {
		this.empoyeeId = id;
		this.employeeName = name;
		this.department = dept;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employeeClone = (Employee) super.clone();
		
		Department dptClone = (Department) getDepartment().clone();
		employeeClone.setDepartment(dptClone);
				
		return employeeClone;
	}
	
	

	public void setDepartment(Department department) {
		this.department = department;
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
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (empoyeeId != other.empoyeeId)
			return false;
		return true;
	}

	public int getEmpoyeeId() {
		return empoyeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	// Accessor/mutators methods will go there

}

class Department implements Cloneable {
	private int id;
	private String name;

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}
	// Accessor/mutators methods will go there

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}