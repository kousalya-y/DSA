public class Stack {
    private Node top;
    private int length;
    

    private class Node{
        private int data;
        private Node next;

        private Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        Stack s1 = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Print the list:");
        s.printList();
        System.out.println(s.pop());
        s.printList();
    }

    private void reverseS(Node top) {
        Stack s1 = new Stack();
        s1.top = null;
        Node temp = top;
        while(temp != null){
            s1.push(pop()); 
            s1.top = s1.top.next;
            temp = temp.next;
        }
       s1.printList();
    }

    private int pop() {
        if(top == null){
            return 0;
        }
        Node temp1 = top;
        Node temp = top.next;
        top.next = null;
        top = temp;
        length--;
        return temp1.data;
    }

    private void printList() {
        Node temp = top;
        while(temp!=null){
         System.out.print(temp.data+"--->");
         temp = temp.next;
        }
        System.out.println("null");
        System.out.println("length is: " + length);
    }

    private void push(int i) {
        Node newNode = new Node(i);
        if(top == null){
            top = newNode;
            length = 1;
            return;
        }
        newNode.next = top;
        top = newNode;
        length++;
    }

    public static boolean isempty() {
        return false;
    }
    
    
}
