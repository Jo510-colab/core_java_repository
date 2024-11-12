package Designing1;

public class DesignLogic {
	public static void main(String[] args) {
		
	
	int n=10;
	int m=50;
	int N=5;
	for (int i=n;i<=m;i++) {
		int num=i;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		if (sum==N) {
			System.out.println(i);
		}
	}
	}
}
	


