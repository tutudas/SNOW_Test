package com.test.exerciseTest;

import com.test.exerciseTest.employee;
import com.test.exerciseTest.salary;

public class virtualDemo {
	   public static void main(String [] args)
	   {
	      salary s = new salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	     employee e = new salary("John Adams", "Boston, MA", 2, 2400.00);
	    // employee emp = new employee("John Adams", "Boston, MA", 2);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	    //  emp.mailCheck();
	    }
	}


