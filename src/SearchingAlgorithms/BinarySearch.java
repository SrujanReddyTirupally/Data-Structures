package SearchingAlgorithms;

public class BinarySearch {

	public static void main(String[] args) {
           int [] arr= {1,2,4,9,10,11};
		
		Binarysearch(arr, 11);
	
	}
	
	public static void Binarysearch(int arr[],int val) {
		 int start = 0;
		 int end = arr.length;
		
		 while(start<end) {
			 int mid = (start+end)/2;
			 if(arr[mid]==val) {
				 System.out.println(val+" found at "+mid);
				 break;
			 }
			 else if(arr[mid]<val){
				 
				 start =mid+1;
				 
				 
			 }
			 else {
				 end = mid;
			 }
		 }
		
	}

	

}
