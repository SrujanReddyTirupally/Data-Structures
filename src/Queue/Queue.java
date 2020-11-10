package Queue;

public class Queue {
	Node front;
	Node rear;
	
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(front==null) {
			
			front=node;
			
		}
		
		else {
			Node n = front;
			while(n.next!=null) {
				
				n = n.next;
			}
			
			n.next=node;
			rear=node;
			
			
			
			}
		
		
		
		
	}
	
	public void delete() {
		front = front.next;
		
		System.out.println("front is "+front.data);
		
	}
	
	public void show() {
		Node n = front;
		while (n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	
	}
	

}
