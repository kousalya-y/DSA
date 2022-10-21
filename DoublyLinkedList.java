import java.util.NoSuchElementException;

import javax.sound.sampled.DataLine;

public class DoublyLinkedList {
    private Node head;  
      private Node tail;
      private int length;

    private static class Node{
       private int data;
       private Node prev;
       private Node next;

        private Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static void main(String[] args){
        DoublyLinkedList Dlist = new DoublyLinkedList();
        Dlist.head = new Node(1);
        Node secondn = new Node(2);
        Node thirdn=new Node(3);
        Node fourthn=new Node(4);
        Dlist.head.next = secondn;
        secondn.next=thirdn;
        secondn.prev = Dlist.head;
        thirdn.next=fourthn;thirdn.prev = secondn;
        fourthn.prev = thirdn;
        Dlist.tail = fourthn;

        System.out.println("Print the list:");
        Dlist.printListForward(); 
        Dlist.printListBackward(); 
        System.out.println();

        System.out.println("Find the length:");
        Dlist.length = Dlist.Findlength();        
        System.out.println();


        System.out.println("Insert in the begining:");
        Dlist.insertatBegin(10); 
      //  Dlist.printListForward(); 
        Dlist.printListBackward();       
        System.out.println();


        System.out.println("Insert at the end:");
        Dlist.insertatEnd(20);  
      //  Dlist.printListForward(); 
        Dlist.printListBackward();      
        System.out.println();


        System.out.println("Insert at a particular position:");
        Dlist.insertatPosition(30, 3);      
        Dlist.printListForward(); 
        Dlist.printListBackward();  
        System.out.println();

        System.out.println("Insert in the begining:");
        Dlist.insertatBegin(28);
        Dlist.insertatBegin(28);
        Dlist.insertatBegin(78);
        Dlist.insertatBegin(98);
        System.out.println();

        System.out.println("Insert 100 at position 5:");
        Dlist.insertatPosition(100,5);  
        System.out.println();


        System.out.println("Delte the first element:");
        Dlist.deleteFirst();

        System.out.println("Delte the last element:"+Dlist.tail.data);
        Dlist.deleteLast();
    }
    
    private void deleteLast() {
        if (isempty()){
            return;
        }
       Node temp = tail.prev;
       temp.next = null;
       tail = temp;
       printListForward();
    }

    private boolean isempty() {
        if(head == null){
            return true;
        }
        return false;
    }

    private void deleteFirst() {
        if (isempty()){
            return;
        }
       Node temp = head.next;
       head.next = null;
       head = temp;
       printListForward();
    }

    public void printListForward(){
        System.out.println("Forward traversal");
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null"+"\n");
    }

    public void printListBackward(){
        System.out.println("backward traversal");
        Node temp=tail;
        
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.prev;
        }
        System.out.print("null"+"\n");
    }
    public int Findlength(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Length of the list : "+ count);
        return count;
}

public void insertatBegin(int num){
    // System.out.println("Insert at the begining");

     Node bNode = new Node(num);
     head.prev=bNode;
     		bNode.next = head;
     head = bNode;
     printListForward();
 }

 public void insertatEnd(int num){
    // System.out.println("Insert at the end");
    if(head == null){
        insertatBegin(num);
    }
     Node bNode = new Node(num);
     bNode.prev = tail;
     tail.next=bNode;
    // System.out.println("After insertion at the end");
    tail = bNode;
     printListForward();
 }

 public void insertatPosition(int num, int pos){
     System.out.println("Insert at pos:"+pos);
     Node posNode=new Node(num);
     if(pos==1 || head == null){
         insertatBegin(num);
     }
    else{
     Node temp=head;
     int count = 1;
     while(temp!=null && count < pos-1){
         count++;
         temp=temp.next;
     }
     Node temp1 = temp.next;
     posNode.next=temp1;
     posNode.prev = temp;
     temp.next=posNode;
     temp1.prev = posNode;
 }
     printListForward();
           
 }
}