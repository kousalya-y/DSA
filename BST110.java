import java.util.LinkedList;
import java.util.Queue;

public class BST110 {
    private Node root;
    private BST110(){
        root = null;
    }

    private class Node{
        private int data;
        private Node left;
        private Node right;

     public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
        public static void main(String[] args) {
            BST110 b1 = new BST110();
           // b1.root = b1.new Node(60);
        
            b1.insert(5);
            b1.insert(3);
            b1.insert(7);
            b1.insert(1);
           // b1.insert( );
            //b1.insert( );
          //  b1.insert( 4);
            //b1.insert( 12); 
            System.out.println("tree:");
            b1.inOrder(b1.root);
            System.out.println();
            if(b1.searchELement(b1.root, 10) != null){
                    System.out.println("found");
            }
            else{
                System.out.println("not found");
            }
        }

    private BST110.Node searchELement(BST110.Node root2, int i) {
        if(root2 == null || root2.data == i){
            return root2;
        }
        if(i < root2.data){
           return searchELement(root2.left, i);
        }
        if(i > root2.data){
           return searchELement(root2.right, i);
        }
        return root2;}

    private void insert(int i) {
        root = insertNode(root, i);
        }

    public BST110.Node insertNode(BST110.Node root2, int i) {
        if(root2 == null){
            root2 = new BST110.Node(i);
            return root2;
        }
        if(i < root2.data){
            root2.left = insertNode(root2.left, i);
        }
        else{
            root2.right = insertNode(root2.right, i);
        }
        return root2;
    }
    private void inOrder(BST110.Node root2) {
        if(root2 == null){
            return;
        }
        Node temp = root2;
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);
    }
}
