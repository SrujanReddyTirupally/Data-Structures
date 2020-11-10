package Linkedlist;

public class LinkedList {
	
	Node head;
	
	public void insert(int data) {
		
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head = node;
		}
		
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next=node;
		}
		
		
		
		
		
	}
	
	public void insertAtstart(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		node.next=head;
		
		head = node;
		
		
	}
	
	public void insertAt(int pos, int data) {
		
		
		if(pos==0) {
			insertAtstart(data);
		}
		else {
			
		
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		Node n = head;
		for(int i=0;i<pos-1;i++) {
			n=n.next;
		}
		
		node.next=n.next;
		n.next=node;
		
	}
	}
	
	public void deleteAt(int pos) {
		if(pos==0) {
			head=head.next;
			}
		
		else {
			
			Node n = head;
			Node n1= null;
			for(int i =0;i<pos-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next=n1.next;
		}
	}
	
	
	
	public void show() {
		Node n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}

}
