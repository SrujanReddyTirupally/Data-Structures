package Recursion;

public class Factorial {
	
	public int fact(int num) {
		if(num==0) {
			return 1;
			
		}
		else {
			return num*fact(num-1);
		}
		
	}
	
	public static void main(String args[]) {
		Factorial factorial = new Factorial();
		int a =factorial.fact(5);
		System.out.println(a);
	}
	

}
