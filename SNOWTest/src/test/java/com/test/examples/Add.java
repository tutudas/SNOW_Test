package com.test.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Add extends Sum{
	
	public static void main(String[] args) {
		
		Add obj = new Add();
	//	obj.test02("suparna");
	//	obj.test03("ssupps");
	//	obj.test04("supp");
	//	obj.isPalindromev3("abdcba");
	//	obj.revNumber(-3456);
	//	obj.fact(5);
	//	obj.printOutput();
	//	obj.fibonacci(6); // pass - 0,1,1,2,3,5
	//	Fibonacciseries(6); // fail - 0,1,2,3,5,8
		
	//	int c =5/0;
		
		replaceAllSpace("s upar na  sa ha");
		
	}
	
	// print method is final in Sum so cannot override in child class
	
//	public void print() {
//		System.out.println("check sum... ");
//	}
	
	 Add(){
		
	}
	
	Add(int a , int b){
		int c= a+b;
		
	}
	
	Add(float a ,float b){
	//	Add(3,4); // compilation error - cann't call one constructor inside another in same class
		float c= a+b;
		
	}
	
	public void test01() {
		List l1 = new ArrayList();
		l1.add(2);
		l1.add(3);
		Iterator it = l1.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals(2)) {
				System.out.println("found... ");
			}
		}	
	}
	
// print alternate char from string	- pass
public void printAlternateChar(String str) {
		
		StringBuffer sb = new StringBuffer();
		int index = 0;
		for(int i=0; i<str.length(); i++) {
			sb.append(str.charAt(i));
			i++;
		}
		
		System.out.println("alternate char... "+sb.toString());
	}

// find 2nd most frequency char

public void test03(String str) {
	//ssupps
	Map m = new HashMap();
	int highest = 0;
	int high = 0;
	char first = 0;
	char second = 0;
	
	for(int i=0; i<str.length(); i++) {
		if(m.containsKey(str.charAt(i))) {
			int count = (int) m.get(str.charAt(i));
			m.put(str.charAt(i), ++count);
		}
		else {
			m.put(str.charAt(i), 1);
		}
		
	}
	
	Set<Entry<String, Integer>> s = m.entrySet();
	for( Entry item : s) {
		System.out.println("hashmap... "+item.getKey() +" "+item.getValue());
		if((int)item.getValue() > highest) {
			high = highest;
			second = first;
			highest = (int)item.getValue();
			first = (char) item.getKey();
			System.out.println("highest.. "+highest +"high "+high);
			
		}
		else {
			if((int)item.getValue() > high) {
				high = (int)item.getValue();
				second = (char)item.getKey();
			}
		}
	}
	
	System.out.println("2nd highest... "+second +" "+high);
}

//print duplicate char from string	- pass
public void test04(String str) {
		
		Set s = new HashSet();
		char dup = 0;
		for(int i=0; i<str.length(); i++) {
			if(!s.contains(str.charAt(i))) {
				s.add(str.charAt(i));
			}
			else {
				dup = str.charAt(i);
			}
		}
		
		System.out.println("duplicate char... "+dup);
	}

public void isPalindrome(String str) {
	//abcba
	int l = 0;
	int h = str.length()-1;
	boolean flag = true;

	while(l<h && flag) {
		if(str.charAt(l) != str.charAt(h)) {
			flag = false;
		}
		else {
			l++;
			h--;
		}
		
	}
	
	System.out.println(flag ? "Palindrome" : "Not Palindrome");  //ternary expression
//	System.out.println(msg);
	
//	if(flag)
//	System.out.println("Palindrome... "+str):
//	else
//		System.out.println(" Not Palindrome... "+str);
	
}
/**
 * 1. without flag
 * 2. condense the if-else into a one-line ternary expression
 * 3. instead of two int variables to parse the string (l and h), use one
 */

public void isPalindromev2(String str) {
	//abuiba
	int l = 0;
	int h = str.length()-1;
// TODO - make this loop 3 lines
	while(l<h) {
		if(str.charAt(l) != str.charAt(h)) {
			break;
		}
		else {
			l++;
			h--;
		}
		
	}
	
	if(l>=h)
		System.out.println("Palindrome... "+str);
	else
		System.out.println(" Not Palindrome... "+str);
	
	}

public void isPalindromev3(String str) {
	//abuiba

//	l = n + 0
//	h = length -n -1
	
	int n = 0;
	
//  make this loop 3 lines
	while(n<str.length()-n && str.charAt(n) == str.charAt(str.length()-n-1)) {
		n++;
	}
	
	System.out.println(n>=str.length()-n ? "Palindrome" : "Not Palindrome");  //ternary expression
//	if(n>=str.length()-n)
//		System.out.println("Palindrome... "+str);
//	else
//		System.out.println(" Not Palindrome... "+str);
//	
	}

public void revNumber(int num) {

	int rev = 0;
	while(num != 0) {
		rev = rev * 10 + num%10;
		num= num/10;
	}
	System.out.println(" reverse number... "+rev);
	int num1 = 123456; // if number is negative treat as string, print  654321-
	System.out.println(" reverse number using SB.. "+new StringBuffer(String.valueOf(num1)).reverse());
	
}

public void fact(int num) {
	int out = 1;
	
	for(int i=1 ; i<=num; i++) {
		out = out * i;
	}
	System.out.println(" factorial... "+out);
}

public void printOutput() {
	byte a =10;
	byte b =20;
	int c;
	c = (a+b); // either cast byte (a+b) OR cast c as int - 30
	System.out.println(" factorial... "+c);
}

// pass
public void fibonacci(int count) {
	int a1 =0;
	int a2 =1;
//	int c;

	for(int i=1;i<=count;++i) {
		System.out.println(a1+",");
		int	c= a1+a2;
		a1 = a2;
		a2 = c;		
	}
	
}

//fail
public static void Fibonacciseries(int n) {
	int a=0;
	int b =1;
	int t =0;
	if (n <=0) {
		System.out.println("Invalid input n = " + n);
	}
	System.out.print("" + a); // when n >=1
	for(int i =2; i <= n; i++) {
		t = a+b;
		a = b;
		b = t;
		System.out.print(", " + b); // print i-th term, i>=2
	}
		
	System.out.println("");
	
}

public static void replaceAllSpace(String str) {
	String str2 = str.replaceAll("\\s", "");
	System.out.println("result.."+str2);
}

} // end class
