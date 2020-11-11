package SearchingAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		
		int [] arr= {1,2,4,9,10,11};
		
		Linearsearch(arr, 9);
	

	}
	public static void Linearsearch(int arr[],int val) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==val) {
				System.out.println(val +" found at "+i );
			}
		}
		
	}

}
