package com.test.exerciseTest;


public class circle implements abstractDrawShape{
	public void draw()
	{
		System.out.println("draw a circle....");
		
	}
	public void howManySides()
	{
		System.out.println("circle has zero sides.." );
	}

	public static void main(String[] args) throws Exception {
		
		
		circle cl= new circle();
		cl.draw();
		cl.howManySides();
		
	}
	
	
}
