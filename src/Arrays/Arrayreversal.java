package Arrays;

public class Arrayreversal {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		
		reverse(arr);
		show(arr);

}
	
	public static void reverse(int arr[]) {
		
		int low=0;
		int high=arr.length-1;
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(high>low) {
				temp=arr[high];
				arr[high]=arr[low];
				arr[low]=temp;
				low++;
				high--;
			}
		}
	}
	
	public static void show(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
