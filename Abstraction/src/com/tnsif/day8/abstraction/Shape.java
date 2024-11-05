package com.tnsif.day8.abstraction;

public abstract class Shape {
	protected float area;
	abstract void calArea(); //abstract method
	void show() //concrete method(subclass)
	{
		System.out.println("Area of the shape is" + area);
	}

}
