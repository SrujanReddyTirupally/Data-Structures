package BSTree;

public class Bst {
       Node rootNode;
       
       public void insert(int value) {
    	   if(rootNode==null) {
    		   rootNode = new Node(value);
    	   }
    	   
    	   rootNode.insert(value);
       }
       
       public void travserseInorder() {
    	   if(rootNode!=null) {
    		   rootNode.traverseInorder();
    	   }
       }
}
