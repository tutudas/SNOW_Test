package com.test.exerciseTest;

public class Factorial {
	int num;
	int result;
	
	public void setNum(int a)
	{
		num = a;
	}
	
	public int result()
	{
		return result;
	}
	
	public int Factoril(int x) {
		int result =0;
		if( x <= 0) {
			result = 1;
		}
		else {
			result = x  *  Factoril( x-1);
		}
		
		return result;
	}
	
	public void execute () {
		
		result = this.Factoril(num);
	}

	
	
}
