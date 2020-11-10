package Arrays;

import java.util.Hashtable;

public class TwoArraysContainsSameElement {
	public static void main(String args[]) {
	int arr1[]= {1,2,3,5,4};
	
	Hashtable<Integer, Integer> hs=new Hashtable<Integer, Integer>();
	
	for(int i=0;i<arr1.length;i++) {
		
		hs.put(arr1[i],i);
		
	}
	int arr2[]= {7,8,9,5};
	for(int i=0;i<arr2.length;i++) {
	        boolean b = hs.containsKey(arr2[i]);
	        
	        if(b==true) {
	        	System.out.println("true");
	        }
	
}
	}
	
		
		
	}


