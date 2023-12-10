package com.test.exerciseTest;

import com.test.exerciseTest.employee;

public class salary extends employee {
	
	//public double salary; 
	
	   private double salary; //Annual salary
	   public salary(String name, String address, int number, double
	      salary)
	   {
		   super(name, address, number);
	       setSalary(salary);
	      // super(name, address, number);
	   }
	   
	   public void mailCheck()
	   {
	       System.out.println("Within mailCheck of Salary class ");
	       System.out.println("Mailing check to " + getName()
	       + " with salary " + salary);
	   }
	   public double getSalary()
	   {
	       return salary;
	   }
	   public void setSalary(double newSalary)
	   {
	       if(newSalary >= 0.0)
	       {
	          salary = newSalary;
	       }
	   }
	   public double computePay()
	   {
	      System.out.println("Computing salary pay for " + getName());
	      return salary/52;
	   }
	   
	   public void printSalary()
	   {
	   }
	   }
	
	

