package day2;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setSid(100);
		s1.setSname("jo");
		s1.setSdept("ece");
		s1.setSyear(2025);
		s1.setSmobile("1234567890");
		
		s2.setSid(101);
		s2.setSname("josh");
		s2.setSdept("ece");
		s2.setSyear(2025);
		s2.setSmobile("0987654321");
		
		s3.setSid(102);
		s3.setSname("jyotsna");
		s3.setSdept("ece");
		s3.setSyear(2025);
		s3.setSmobile("1234509876");
		
		
		System.out.println(s3);
	}

}
