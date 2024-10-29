package day2;

public class Customer {
	private int Cid;
	private String Cname;
	private String Cadd;
	private String City;
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCadd() {
		return Cadd;
	}
	public void setCadd(String cadd) {
		Cadd = cadd;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}//toString method
	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", Cadd=" + Cadd + ", City=" + City + "]";
	}
	
}
		