package Stack;

public class Stack {
	Node top = null;
	
	public void push(int data) {
		if(top==null) {
		Node node = new Node();
		node.data=data;
		node.previous=null;
		top = node;
		}
		else {
			
			Node node = new Node();
			node.data=data;
			node.previous=top;
			top = node;
			
			}
		
		
	}
	
	public void pop() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		else {
			Node n = top;
			n.previous=top.previous;
			top =n.previous;
		}
	}
	
	public void peek() {
		if(top==null) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("value of top is "+top.data);
		}
	}
	
	public void show() {
		Node n=top;
		while(n.previous!=null) {
			
			System.out.println(n.data);
			
			n = n.previous;
			}
		System.out.println(n.data);
		
	}
	
	

}
