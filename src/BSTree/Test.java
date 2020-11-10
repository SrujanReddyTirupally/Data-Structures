package BSTree;

public class Test {

	public static void main(String[] args) {
		Bst bst = new Bst();
		bst.insert(25);
		bst.insert(26);
		
		bst.insert(24);
		bst.insert(21);
		bst.insert(29);
		bst.travserseInorder();

	}

}
