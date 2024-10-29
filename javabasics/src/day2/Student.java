package day2;

public class Student{
		private int Sid;
		private String Sname;
		private String Sdept;
		private int Syear;
		private String Smobile;
		public int getSid() {
			return Sid;
		}
		public void setSid(int sid) {
			Sid = sid;
		}
		public String getSname() {
			return Sname;
		}
		public void setSname(String sname) {
			Sname = sname;
		}
		public String getSdept() {
			return Sdept;
		}
		public void setSdept(String sdept) {
			Sdept = sdept;
		}
		public int getSyear() {
			return Syear;
		}
		public void setSyear(int syear) {
			Syear = syear;
		}
		public String getSmobile() {
			return Smobile;
		}
		public void setSmobile(String smobile) {
			Smobile = smobile;
		}
		@Override
		public String toString() {
			return "EntitY [Sid=" + Sid + ", Sname=" + Sname + ", Sdept=" + Sdept + ", Syear=" + Syear + ", Smobile="
					+ Smobile + "]";
		}
		
		

}
