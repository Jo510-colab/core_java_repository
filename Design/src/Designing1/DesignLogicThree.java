package Designing1;

public class DesignLogicThree {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			if(i==1) {
			for(int j=1; j<=n; j++) {
					System.out.print(j+" ");
			}
			System.out.println();
				}else if (i == n ) {
					for (int j=n;j>=1;j--) {
					System.out.print(j +" ");
				}
				}else {
					System.out.print(i+" ");
					for (int j=1;j<=n-2;j++) {
			System.out.print("  ");
		}
					System.out.print(n-i+1+" ");
					System.out.println();
	}

}
	}
}
