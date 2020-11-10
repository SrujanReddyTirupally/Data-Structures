package BSTree;

public class Node {
	int data;
	Node leftNode;
	Node rightNode;
	public Node(int data) {
		this.data=data;
	}
	
	public void insert(int value) {
		if(value==data) {
			return;
		}
		
		if(value<data) {
			if(leftNode==null) {
				leftNode = new Node(value);
			}
			else {
				leftNode.insert(value);
			}
		}
		else {
			if(rightNode==null) {
				rightNode= new Node(value);
			}
			else {
				rightNode.insert(value);
			}
		}
	
	}
	
	public void traverseInorder() {
		if(leftNode!=null) {
			leftNode.traverseInorder();
		}
		System.out.println("data "+ data);
		if(rightNode!=null) {
			rightNode.traverseInorder();
		}
	}
}


	
	
	