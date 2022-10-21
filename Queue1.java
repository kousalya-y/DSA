//front->delete
//rear->insert
public class Queue1 {
    private Node front;
    private int length;
    private Node rear;


    private class Node{
        int data;
        Node next;
        private Node(int data){
            this.data = data;
            next = null;
        }
    } 


    private Queue1(){
        front = rear = null;
        length = 0;
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.print();

        q.dequeue();
        q.print();
    }

    private void print() {
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("length:"+ length);
    }

    private void dequeue() {
        if(front == null){
            return;
        }
        Node temp = front.next;
        front.next = null;
        front = temp;
        length--;
    }

    private void enqueue(int i) {
        Node newNode = new Node(i);
        if(front == null){
            front = rear = newNode;
            length = 1;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        length++;
    }
}
