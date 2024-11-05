package day3;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your name with initial:");
		String fullName= input.nextLine();
		
		System.out.println("Enter your roll number:");
		String rollNumber= input.nextLine();
		
		System.out.println("Enter your grade:");
		String grade= input.nextLine();
		
		System.out.println("percentage:");
		Double percentage= input.nextDouble();
		
		System.out.println("name:" +fullName);
		System.out.println("roll number:"+rollNumber);
		System.out.println("grade:"+grade);
		System.out.println("percentage:"+percentage +"%");
		
		
		
		input.close();
		
		
		
		
	}

}
