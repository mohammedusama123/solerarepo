package daytwoAssignment;

public class EmployeeDemo {
  public static void main(String[] args) {
	 Employee e1=new Employee();
	 Employee e2=new Employee();
	 e1.setEmp_id(1);
	 e2.setEmp_id(1);
	 System.out.println(e1.equals(e2));
	 System.out.println(e1.hashCode());
	 System.out.println(e2.hashCode());
}  
}
