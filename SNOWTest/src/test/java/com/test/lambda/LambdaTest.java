package com.test.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTest {

	public static void main(String[] args) {
		
		LambdaTest l1 = new LambdaTest();
		l1.lambdaTest01();
	}
	
public void lambdaTest01() {
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
    
    
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
		
	}

}
