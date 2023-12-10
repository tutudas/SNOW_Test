package com.test.leetcode;

import java.util.HashSet;
import java.util.Set;

import com.test.testng.pkg1.Test1;

public class Leet1to5 {

	String title;
	int num;
	int [] arr = {2,7,11,13};
	int[] index = new int[2];
	static int[] nums = {3,2,3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leet1to5 obj = new Leet1to5();
	//	System.out.println(obj.title);
	//	obj.printData("suparna4 my1 name2 is3");
		
	//	obj.twoSum(nums, 6);
	//	obj.lengthOfLongestSubstring("pwwkewabaccddcc");
		obj.longestPalindrome("bb");
	//	System.out.println(obj.isPallindrome("bb"));
		
	}
	
	public Leet1to5() {
		System.out.println("Hello");
	}
	
	public Leet1to5(int num) {
		this.num = num;
		System.out.println("world.");
	//	Test1(); // cannot call constructor inside other constructor in same class
	}
	
	public int[] checkSum(int[] a) {
		
		
		return index;
	}
	
	public void printData(String s) {
		
		int j =1;
		
		String[] result = new String[s.length()];
		String[] s2 = s.split(" ");
		
		for(int i=0; i<s2.length; i++) {
			
			System.out.println("inside loop array..."+ s2[i]);
			
			if(s2[i].charAt(s2[i].length() -1) == '1'){
				
					System.out.println("here..."+ s2[i]);
					result[0] = s2[i];
					
				}
			if(s2[i].charAt(s2[i].length() -1) == '2'){
				
				System.out.println("here..."+ s2[i]);
				result[1] = s2[i];
				
			}
			if(s2[i].charAt(s2[i].length() -1) == '3'){
				
				System.out.println("here..."+ s2[i]);
				result[2] = s2[i];
				
			}
			if(s2[i].charAt(s2[i].length() -1) == '4'){
	
				System.out.println("here..."+ s2[i]);
				result[3] = s2[i];
	
			}
			}
			for(int k=0; k<result.length; k++) {
				System.out.println("Result array..."+ result[k]);
			}
			
		}
	
	// leetcode -20
	public void validParanthesis(String s) {
		
	}
	// leetcode -19

	 public class ListNode {
		    int val;
		    ListNode next;
		    ListNode() {}
		    ListNode(int val) { this.val = val; }
		    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }	
	
public void removenthNodeFronLinkedList(ListNode head, int k) {
	
	ListNode cur = new ListNode();
	cur = head;
	
	if(cur == null) {
		System.out.println("empty...");
	}
	
	for(int i=0; (i < k && cur != null) ; i++) {
		cur = cur.next;
	}
	
	}

// Problem 1 - pass

public int[] twoSum(int[] nums, int target) {
	int[] out = new int[2];
    for(int i=0; i<nums.length -1; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums [i] + nums[j] == target){
                out[0] = i;
                out[1] = j;
            }
        }
    }
    System.out.println("1st..."+out[0]);
    System.out.println("2nd..."+out[1]);
    
    return out;
}

//Problem 2 - To Do
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode dummy = new ListNode();
	
    return dummy;
}

//Problem 3 - pass longest substring without repetation
public int lengthOfLongestSubstring(String s) {
    
	Set s2 = new HashSet();
	
	StringBuffer sb = new StringBuffer();
	
	for(int i=0; i<s.length(); i++){
		if (! s2.contains(s.charAt(i))) {
			s2.add(s.charAt(i));
			sb.append(s.charAt(i));	
		}
	}
	
	System.out.println("substring..." +sb.toString()+"   "+"length..."+sb.length());
	return sb.length();
	
}

//Problem 5 - Max palindrome substring..cddc;max length...4 // need to fix
public String longestPalindrome(String s) {

	String max = "";
	if(s.length() == 0 ||s.length() == 1) return s;

		for(int i=0; i<s.length()-1; i++){
			//last i value = l-1
			for(int j=i+1; j<=s.length(); j++){
				//last j value (that you expect) is l
				
				//for the last i value (l-1), the j value must be (l), but l == l
				String tmp = s.substring(i,j);
				// System.out.println(tmp);
				if(isPallindrome(tmp)){
						if(tmp.length() > max.length()){
								max = tmp;
						}
				}
			
			}
			
		}

// System.out.println("Max palindreome substring.." + max+ "   "+ "max length..."+max.length());
return max;
}

	

// need for Problem 5
public  boolean isPallindrome(String s) {
	String rev = "";
	for(int i=s.length()-1;i>=0; i--){
		rev = rev + s.charAt(i);
	}
	
	if(s.equals(rev)) {
		return true;
	}
	else return false;
}

} // end class