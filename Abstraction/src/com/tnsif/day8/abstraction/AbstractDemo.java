package com.tnsif.day8.abstraction;

public class AbstractDemo {
	public static void main(String[] args) {
		Square sq= new Square();
		Rectangle r1= new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("-----------------------------");
		//runtime polymorphism/dynamic binding/late binding
		//ex: Method Overriding
		
		Shape shape;
		shape=new Square(12.5f);
		
		shape.calArea(); // invoked square class calArea()
		shape.show();
		shape=new Rectangle(10,20);
		
		shape.calArea(); // invoked Rectangle class calArea()
		shape.show();
		
	}

}
