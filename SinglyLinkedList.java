import java.util.logging.Handler;

public class SinglyLinkedList{
    private Node head;
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static void main(String[] args){
        SinglyLinkedList slist=new SinglyLinkedList();
        slist.head=new Node(1);
        Node secondn=new Node(2);
        Node thirdn=new Node(3);
        Node fourthn=new Node(4);
        slist.head.next = secondn;
        secondn.next=thirdn;
        thirdn.next=fourthn;
        System.out.println("Print the list:");
        slist.printList(); 

        System.out.println("Find the length:");
        slist.Findlength();

        System.out.println("Insert in the begining:");
        slist.insertatBegin(10);

        System.out.println("Insert at the end:");
        slist.insertatEnd(20);

        System.out.println("Insert at a particular position:");
        slist.insertatPosition(30, 3);

        System.out.println("Delete the first element:");
        slist.deleteFirst();

        System.out.println("Delete the last element:");
        slist.deleteEnd(); 

        System.out.println("Delete the element at a particular position:");
        slist.deletePos(2);

        System.out.println("Insert in the begining:");
        slist.insertatBegin(28);
        slist.insertatBegin(23);
        slist.insertatBegin(78);
        slist.insertatBegin(98);

        System.out.println("Insert 100 at position 5:");
        slist.insertatPosition(100,5);           
 
        System.out.println("Search and element:");
        slist.searchEl(5);

        System.out.println("Find the middle element");
        slist.findMiddle();

        System.out.println("remove element by key:");
        slist.removeKeyEl(1);
    }

    public void printList(){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null"+"\n");
    }

    public void Findlength(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Length of the list : "+ count);
}
    public void insertatBegin(int num){
        System.out.println("Insert at the begining");
        Node bNode = new Node(num);
        bNode.next=head;
        head=bNode;
        printList();
    }
    public void insertatEnd(int num){
        System.out.println("Insert at the end");
        Node bNode = new Node(num);
        Node temp=head;
        if(head==null){
            head=temp;
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=bNode;
        System.out.println("After insertion at the end");
        printList();
    }
    public void insertatPosition(int num, int pos){
        System.out.println("Insert at pos:"+pos);
        Node posNode=new Node(num);
        if(pos==1){
            posNode.next=head;
            head=posNode;
        }
       else{
        Node temp=head;
        int count = 1;
        while(temp!=null && count < pos-1){
            count++;
            temp=temp.next;
        }
        posNode.next=temp.next;
        temp.next=posNode;
    }
        printList();
              
    }
    public void deleteFirst(){
        if(head==null){
            return;
        }
        System.out.println("DeleteFirst");
        Node temp=head;
        head=head.next; 
        temp.next=null;
        printList();

    }
    public void deletePos(int pos){
        System.out.println("Delete at pos : "+ pos);
        if(pos == 1)
        {
            head = head.next;
        }
        else{
        Node temp=head;
        int count =1;
        while(temp != null && count < pos-1){
            count++;
            temp=temp.next;
        }
        Node temp1 = temp.next;
        temp.next = temp1.next;
        printList();

    }
}
    public void deleteEnd(){
        if(head == null){
            return;
        }
        else if(head.next == null ){
           head = null;
           return;
        }
        else{
        System.out.println("DeleteEnd");
        Node temp=head;
        Node temp1=null;
        while(temp.next!=null){
            temp1=temp;
            temp=temp.next;
        }
        temp1.next=null;
        printList();
    }
}
public void searchEl(int num){
    if(head == null){
        System.out.print("empty list");
        return;
    }
    else{
    Node temp = head;
    int count = 1;
    while(temp != null){
        if(temp.data == num){
            System.out.println("Given Element " + num + " found at pos "+ count);
            return;
        }
        temp=temp.next;
        count++;
    }
}
System.out.println(num +" is not found");
}


public void findMiddle(){
    Node fastPtr = head;
    Node slowPtr = head;
    while(fastPtr != null && fastPtr.next!=null){
        fastPtr = fastPtr.next.next;
        slowPtr = slowPtr.next;
    }
    System.out.println("The middle element is "+ slowPtr.data);
}

public void removeKeyEl(int key){
    Node temp = head;
    Node temp1 = null;
    while(temp != null && temp.data != key){
        temp1 = temp;
        temp = temp.next;
    }
    if(temp == null){
        System.out.println("Element not found");return;
    }
    temp1.next = temp.next;
    System.out.println("List after removing the element " + key);
    printList();
}
}
        
    