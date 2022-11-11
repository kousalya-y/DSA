public class validateBst {


        private Node root;
        public validateBst(){
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
            validateBst b1 = new validateBst();
                b1.root = b1.new Node(4);
                b1.root.left = b1.new Node(3);
                b1.root.right = b1.new Node(6);
                b1.root.left.left = b1.new Node(1);
                b1.root.left.right = b1.new Node(2);
                b1.root.right.left = b1.new Node(5);
                b1.root.right.right = b1.new Node(7);
    
                System.out.println("   "+b1.root.data);
                System.out.println("  "+b1.root.left.data+"    "+b1.root.right.data);
                System.out.println(" "+b1.root.left.left.data+"  "+b1.root.left.right.data + "  "+b1.root.right.left.data+"  "+b1.root.right.right.data);
                boolean result = b1.validateBST(b1.root, Long.MIN_VALUE, Long.MAX_VALUE);

                if(result){
            System.out.println("Valid BST");
                }
                else{
                    System.out.println("inValid BST");
                }
            }
            
    
        private boolean validateBST(validateBst.Node root2, long min, long max) {
            if(root2 == null){
                return true;
            }
            if(root2.data <= min || root2.data >= max){
                return false;
            }
            boolean left = validateBST(root2.left, min, root2.data);
            if(left){
                       boolean right = validateBST(root2.right, root2.data, max);
                       return right;
            }
            return false;
            }
    
}