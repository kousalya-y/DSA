public class CircularLinkedList {

    private Node last;
    private int length = 0;

    private static class Node{
        private int data;
        private Node next; 
        private Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args){
        CircularLinkedList Clist = new CircularLinkedList();
        Clist.last = new Node(1);
        Node s = new Node(2);
        Node t = new Node(3);
        Node f = new Node(4);
        Clist.last.next = s;
        s.next = t;
        t.next = f;
        f.next = Clist.last;
        Clist.last = f;

        System.out.println("Print the list");
        Clist.printList();
        System.out.println("InsertFirst");
        Clist.insertFirst(10); 
        Clist.printList();  
        System.out.println("InsertLast");
        Clist.insertLast(20);  
        Clist.printList();
        System.out.println();
        System.out.println("RemoveFirst");
        Clist.RemoveFirst();
        Clist.printList();
    }

    private void RemoveFirst() {
        if(last == null){
            return;
        }

        Node temp = last.next;
        Node first = temp.next;
        temp.next = null;
        last.next = first;

    }

    private void insertLast(int i) {
        if(last == null){
            return;
        }
        Node newNode = new Node(i);
        Node first = last.next;
        last.next = newNode;
        newNode.next = first;
        last = newNode;
    }

    private void insertFirst(int i) {
        if(last == null){
            return;
        }
        Node newNode = new Node(i);
        Node first = last.next;
        last.next = newNode;
        newNode.next = first;
    }

    public void printList(){
        length = 0;
        if(last == null){
            return;
        }
        Node first = last.next; 
        
        while(first != last){
            System.out.print(first.data+"--->");
            first = first.next;
            length++;
        }
        System.out.println(first.data);
        System.out.println(length+1+" no of elements");
    }
}
