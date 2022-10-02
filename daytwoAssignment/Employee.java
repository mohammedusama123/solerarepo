package daytwoAssignment;

import java.util.Objects;

public class Employee {
	
	@Override
	public int hashCode() {
		return Objects.hash(emp_id, emp_name);
	}
	
	private int  emp_id;
	private String emp_name;
   public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
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
		//return emp_id == other.emp_id && Objects.equals(emp_name, other.emp_name);
		return this.emp_id==other.emp_id;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
	
	
	

   
}
