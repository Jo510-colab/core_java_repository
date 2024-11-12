package Designing1;

public class DesignLogicTwo {
	public static void main(String[] args) {
		int[] numbers = {10,11,12,13};
		int[] firstAddends = {1, 1, 1, 1};
		int[] secondAddends = {0, 1, 2, 3};
		 for (int i=0; i<numbers.length; i++) {
			 int sum=firstAddends[i] + secondAddends[i];
			 System.out.println(numbers[i] + " = " + firstAddends[i] + " + " + secondAddends[i] + " = " + sum );
		 }
	}
}