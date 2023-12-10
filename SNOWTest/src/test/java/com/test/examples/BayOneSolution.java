package com.test.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class BayOneSolution {
	
	public static void main(String[] args) {
		
		BayOneSolution obj = new BayOneSolution();
	//	System.out.println(obj.isPoweredOfThree(27));
	//	System.out.println(obj.convertIntegerToRoman(1111));
		
		System.out.println(obj.convertIntegerToRomanVer2(1245));
	//	obj.isAlphabetic('y'); // check for vowel
	//	obj.convertRomanToInteger("MMCM");
		
	}
	
	public String isPoweredOfThree(int num) {
		
		num = num/3;
		String flag = "";
		while(num>1) {
			num = num/3;
			if(num==1) {
				flag ="valid";
			}
			else {
				flag = "invalid";
			}
			
		}
		return flag;
	}
	
	public void isAlphabetic(Character ch) {
		
		Character c1 = ch;
		
		Character[] vArr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		
		Set<Character> s = new HashSet<Character>();
		
		s.addAll(Arrays.asList(vArr));
		
		Arrays.asList(vArr);
		
		
		if(!Character.isDigit(c1)) {
			if(s.contains(ch)) {
				System.out.println("vowel");
			}
			else {
				System.out.println("consonant");
			}
		}
		else {
			System.out.println("NOT alphabet");
		}
		
	}
	
public String convertIntegerToRoman(int input) {
	if (input < 1 || input > 3999)
        return "Invalid Roman Number Value";
    String s = "";
    while (input >= 1000) {
        s += "M";
        input -= 1000;        }
    while (input >= 900) {
        s += "CM";
        input -= 900;
    }
    while (input >= 500) {
        s += "D";
        input -= 500;
    }
    while (input >= 400) {
        s += "CD";
        input -= 400;
    }
    while (input >= 100) {
        s += "C";
        input -= 100;
    }
    while (input >= 90) {
        s += "XC";
        input -= 90;
    }
    while (input >= 50) {
        s += "L";
        input -= 50;
    }
    while (input >= 40) {
        s += "XL";
        input -= 40;
    }
    while (input >= 10) {
        s += "X";
        input -= 10;
    }
    while (input >= 9) {
        s += "IX";
        input -= 9;
    }
    while (input >= 5) {
        s += "V";
        input -= 5;
    }
    while (input >= 4) {
        s += "IV";
        input -= 4;
    }
    while (input >= 1) {
        s += "I";
        input -= 1;
    }    
    return s;
	}

public String convertIntegerToRomanVer2(int input) {
	/*
	Map<Integer, String> map = new HashMap<Integer, String>();
	
	 map.put(1000, "M");
     map.put(900, "CM");
     map.put(500, "D");
     map.put(400, "CD");
     map.put(100, "C");
     map.put(90, "XC");
     map.put(50, "L");
     map.put(40, "XL");
     map.put(10, "X");
     map.put(9, "IX");
     map.put(5, "V");
     map.put(4, "IV");
     map.put(1, "I");
     */
	
     StringBuilder sb = new StringBuilder();
     int[] num = {1000, 900, 500, 400, 100, 90,50, 40, 10, 9 ,5,4,1};
     String[] rs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
     
     for(int i=0; i<num.length; i++) {
    	 	int t1 =  input /num[i];
    	 	input = input %num[i];
    	 	
    	 	for (int j=0; j<t1; j++) {
    	 		sb.append(rs[i]);
    	 	}
    	 	if (input == 0)
    	 		break;
     }
     
     return sb.toString();
}

public int convertRomanToInteger(String s) {
	
	int out =0;
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("M", 1000);
    map.put("CM", 900);
    map.put( "D", 500);
    map.put("CD", 400);
    map.put("C", 100);
    map.put("XC", 90);
    map.put("L", 50);
    map.put("XL", 40);
    map.put("X", 10);
    map.put("IX", 9);
    map.put("V", 5);
    map.put("IV", 4);
    map.put("I", 1);
	
    Set<Entry<String, Integer>> s2 = map.entrySet();
    
    String rd = "";
    int i = 0;
    
    while(i<s.length())
    {
    		rd = String.valueOf(s.charAt(i));
    		
    		if( s.charAt(i)== 'C') {
     			if(s.charAt(i+1)== 'M') { 
     				rd= "CM";
     				i++;
     			
     			}
     			else if(s.charAt(i+1)== 'D') {
     				rd= "CD";
     				i++;
     			}
     			else rd = "C";	
     		}
    		if( s.charAt(i)== 'X') {
     			if(s.charAt(i+1)== 'C') {
     				rd= "XC";
     				i++;
     			}
     			else if(s.charAt(i+1)== 'L') {
     				rd= "XL";
     				i++;
     			}
     			else rd = "X";	
     		}
    		if( s.charAt(i)== 'I') {
     			if(s.charAt(i+1)== 'V') {
     				rd= "IV";
     				i++;
     			}
     			else if(s.charAt(i+1)== 'X') {
     				rd= "IX";
     				i++;
     			}
     			else rd = "I";	
     		}
 			i++;	
 			
 			out += map.get(rd);

   		} // end while	
    		
    System.out.println("output..."+out);
    return out; 
    
	}


} // end class


