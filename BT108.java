public class BT108 {

    private Node root;

    public BT108(){
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
        BT108 b1 = new BT108();
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
        
        int res = b1.findMax(b1.root);
        System.out.println("Maximum : " + res);
    }



    private int findMax(BT108.Node root2) {
        if(root2 == null){
            return Integer.MIN_VALUE;
        }
        int result = root2.data;
        int left = findMax(root2.left);
        int right = findMax(root2.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }
        return result;

    }
    
}
