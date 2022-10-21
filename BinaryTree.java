import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BinaryTree {



    private Node root;
    public BinaryTree(){
        root = null;
    }
    private class Node
    {
        int data;
        Node left;
        Node right;

        private Node(int data) {
            this.data = data;
            this.left = this.right = null;            
        }
    }
    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree();
            b1.root = b1.new Node(1);
            b1.root.left = b1.new Node(2);
            b1.root.right = b1.new Node(3);
            b1.root.left.left = b1.new Node(4);
            b1.root.left.right = b1.new Node(5);
            b1.root.right.left = b1.new Node(6);
            b1.root.right.right = b1.new Node(7);

            System.out.println("   "+b1.root.data);
            System.out.println("  "+b1.root.left.data+"    "+b1.root.right.data);
            System.out.println(" "+b1.root.left.left.data+"  "+b1.root.left.right.data + "  "+b1.root.right.left.data+"  "+b1.root.right.right.data);
            b1.preOrder(b1.root);
            System.out.println();
            b1.iterativePreOrder(b1.root);
            System.out.println();
            b1.inOrder(b1.root);
            System.out.println();
            b1.IterativeInOrder(b1.root); 
            System.out.println();
            b1.postOrder(b1.root); 
            System.out.println();
            b1.IterativePostOrder(b1.root);  
            System.out.println();
            b1.LevelOrder(b1.root);
                
    }
    private void LevelOrder(BinaryTree.Node root2) {
        Node temp = root2;
        Queue<Node> queue = new LinkedList<>();
        queue.add(temp);
        while(!queue.isEmpty()){
            temp = queue.remove();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
    private void IterativePostOrder(BinaryTree.Node root2) {
        if(root2 == null){
        return;
    }
    Stack<Node> stack = new Stack<>();
    Node current = root;
    while(!stack.empty() || current!=null){
        if(current != null){
            stack.push(current);
            current = current.left;
        }
        else{
            Node temp = stack.peek().right;
            if(temp == null){
                temp = stack.pop();
                System.out.print(temp.data + " ");
                while(!stack.empty() && temp == stack.peek().right){
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                }
            }
            else{
                current = temp;
            }
        }
     }

    
}
    private void postOrder(BinaryTree.Node root2) {
        if(root2 == null){
            return;
        }
        Node temp = root2;
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data+" "); 
    }
    private void IterativeInOrder(BinaryTree.Node root2) {
        if(root2 == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while(!stack.isEmpty() || temp!=null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
    }
    }
    private void inOrder(BinaryTree.Node root2) {
        if(root2 == null){
            return;
        }
        Node temp = root2;
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);
    }
    private void iterativePreOrder(BinaryTree.Node root2) {
        if(root2 == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        stack.push(temp);
        while(!stack.isEmpty()){
            temp = stack.pop();
            System.out.print(temp.data+" ");
        if(temp.right!=null){
            stack.push(temp.right);
        }
        if(temp.left!=null){
            stack.push(temp.left);
        }  
    }
    }
    private void preOrder(Node root) {
        if(root == null){
            return;
        }
        Node temp = root;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
}
