package day2;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1=100;
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		
		e1.eid=101;
		e1.ename="jyotsna";
		e1.city="puducherry";
		
		e2.eid=102;
		e2.ename="jo";
		e2.city="pondy";
		
		System.out.println("eid:" + e1.eid + "Emp name:" + e1.ename + "city:" + e1.city);
		System.out.println("eid:" + e2.eid + "Emp name:" + e2.ename + "city:" + e2.city);
		
		
	}

}
