package Linkedlist;


public class Test {

	public static void main(String[] args) {	
		
		LinkedList li = new LinkedList();
		li.insert(3);
		li.insert(10);
		li.insert(12);
		li.insertAtstart(25);
		
		li.deleteAt(2);
		li.show();
		
	}

}
