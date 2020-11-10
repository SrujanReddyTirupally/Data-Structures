package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagrams {

	public static void main(String[] args) {
		String a ="srujan";
		String b ="najrus";
		
	 int arr1[] = new int[a.length()];
	 int arr2 []= new int[a.length()];
	 
	 for (int i =0;i<a.length();i++) {
		 
		 arr1[i]=a.charAt(i);
		 arr2[i]=b.charAt(i);
		 }
	
	 Arrays.sort(arr1);
	 Arrays.sort(arr2);
	
     if(Arrays.equals(arr1, arr2)) {
    		System.out.println("These strings are anagrams");
    	
    }
	

}
}
