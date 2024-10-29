package day2;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1= new Customer();
		Customer c2= new Customer();
		Customer c3= new Customer();
		Customer c4= new Customer();
		Customer c5= new Customer();
		
		c1.setCid(100);
		c1.setCname("jo");
		c1.setCadd("lawspet");
		c1.setCity("pondy");
		
		c2.setCid(101);
		c2.setCname("mercy");
		c2.setCadd("semmandalam");
		c2.setCity("cuddalore");
		
		c3.setCid(102);
		c3.setCname("kiru");
		c3.setCadd("nathapattu");
		c3.setCity("cuddalore");
		
		c4.setCid(103);
		c4.setCname("priyu");
		c4.setCadd("nynarmandapam");
		c4.setCity("pondy");
		
		c5.setCid(104);
		c5.setCname("keerthi");
		c5.setCadd("ot");
		c5.setCity("cuddalore");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		
		//System.out.println("cid: "+ c5.getCid + "cus name: " + c5.getCname + "cus add: " + c5.getCadd + "cus city: " + c5.getCity);
			
	}
}
