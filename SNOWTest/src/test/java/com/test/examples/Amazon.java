package com.test.examples;

public class Amazon {

		public static void main(String[] args) throws IOException {
		    List<Integer> foo = new ArrayList<Integer>();
		    foo.add(3);
		    foo.add(7);
		    foo.add(5);
		    foo.add(6);
		    foo.add(2);
		   
		    System.out.println("result...." +Result.minimalHeaviestSetA(foo));
		}
		    /*
		     * Complete the 'minimalHeaviestSetA' function below.
		     *
		     * The function is expected to return an INTEGER_ARRAY.
		     * The function accepts INTEGER_ARRAY arr as parameter.
		     */

		    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
		              
		    int n = arr.size();
		    int temp = 0;
		    List<Integer> result = new ArrayList<>();
		    for (int i = 0; i < n-i; i++) {
		        for (int j = 0; j < (n - i - 1); j++) {

		            if (arr.get(j) > arr.get(j+1)) {
		                temp = arr.get(j);
		                arr.set(j,arr.get(j+1));
		                arr.set(arr.get(j+1), temp);
		            }
		        }
		    }
		        result.set(0,arr.get(arr.size()-1));
		        result.set(1,arr.get(arr.size()-2));
		   
		        return result;    
		    }



}
