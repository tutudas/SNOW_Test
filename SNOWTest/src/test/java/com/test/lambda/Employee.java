package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
//import java.util.Map.Entry;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.testng.annotations.Test;

public class Employee {
	
	int id;
	String name;
	double sal;
	
	// default constructor 
	public Employee ( ){
		
	}
	
	public Employee ( int empId, String empName, double empSal){
			id = empId;
			name = empName;
			sal = empSal;		
		}
	
	public boolean equals(Employee e) {
		if((e.id == this.id) && ( (e.name).equals(this.name)) && (e.sal==this.sal)){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	class  SortById implements Comparator< Employee > 
	 { 
	     public int compare(Employee a, Employee b) 
	     { 
	         return  (int) (a.id - b.id);
	     } 
	 } 

	 class SortByName implements Comparator< Employee > 
	 { 
	     public int compare(Employee a, Employee b) 
	     { 
	         return  (a.name.compareTo(b.name));
	     } 
	 } 
	
	 // this method will call while print employee object / each employee
	 public String toString() {
		 return (this.id +" "+this.name+" "+this.sal);
	 }
	
	 @Test
	 public void printSortedList() {
		 
		 Employee [] eArr = new  Employee [4] ;
		 
		 ArrayList<Employee> emp = new  ArrayList<Employee>();
		
			
			Employee emp1 = new Employee ( 01, "Susan", 12000);
			Employee emp2 = new Employee ( 02, "Brian", 2000);
			Employee emp3 = new Employee ( 03, "Sushi", 10000);
			Employee emp4 = new Employee ( 04, "Martin", 20000);
			
			emp1.equals(emp2);
			
			Employee[] arr1 = new Employee[2];
			Employee[] arr2 = {emp1, emp2};
			
			arr1[0] = emp1;
			arr1[1] = emp2;
			
			Arrays.equals(arr1, arr2);
			Arrays.sort(arr1, new SortById());
			
			emp.add(emp1);
			 emp.add(emp2);
			 emp.add(emp3);
			 emp.add(emp4);
			 
			 eArr[0]= emp1;
			 eArr[1]= emp2;
			 eArr[2]= emp3;
			 eArr[3]= emp4;
			 
			 Arrays.sort(eArr, new SortById());
			 
			 for(int i=0; i<eArr.length; i++ ) {
				 System.out.println(eArr[i]);
			 }
		  
		 Collections.sort(emp, new SortById());
		 
		   // use lambda
	     Collections.sort(emp , (e1, e2) ->(e1.id - e2.id));
	     System.out.println(emp);
		 
		 Collections.sort(emp, new SortByName());
		   // use lambda
	     Collections.sort(emp , (e1, e2) ->(e1.name.compareTo(e2.name)));
	     System.out.println(emp);
		 
	 }
	 
	 
	 /*  To avoid default constructor make printSortedList() method static 
	  * and then inner class SortById and SortByName need to be static too
	  * static class  SortById implements Comparator< Employee > 
	 { 
	   public int compare(Employee a,   Employee b) 
	     { 
	         return  (int) (a.id - b.id);
	     } 
	 } 

	static class SortByName implements Comparator< Employee > 
	 { 
	     public int compare(Employee a,   Employee b) 
	     { 
	         return  (a.name.compareTo(b.name));
	     } 
	 } 
	
	 // this method will call while print employee object / each employee
	 public String toString() {
		 return (this.id +" "+this.name+" "+this.sal);
	 }
	
	 @Test
	 public static void printSortedList() {
		 ArrayList<Employee> emp = new  ArrayList<Employee>();
		
			
			Employee emp1 = new Employee ( 01, "Susan", 12000);
			Employee emp2 = new Employee ( 02, "Brian", 2000);
			Employee emp3 = new Employee ( 03, "Sushi", 10000);
			Employee emp4 = new Employee ( 04, "Martin", 20000);
			
			emp.add(emp1);
			 emp.add(emp2);
			 emp.add(emp3);
			 emp.add(emp4);
		  
		 Collections.sort(emp, new SortById());
		 System.out.println(emp);
		 System.out.println(emp1);
		 
		 Collections.sort(emp, new SortByName());
		 
	 }
	  */
	  
	 
}
