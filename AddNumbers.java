//Add the numbers in the lists:
//digits are in reverse order, store in the sum in the form of lists:

import java.time.chrono.HijrahEra;
import java.util.logging.Handler;

public class AddNumbers{
    private Node head;

    private static class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static void main(String[] args){
        //list1
        AddNumbers slist = new AddNumbers();
        slist.head = new Node(1);
        Node secondn = new Node(3);
        Node thirdn = new Node(5);
        slist.head.next = secondn;
        secondn.next = thirdn;
        System.out.println("Print the list:");
        slist.printList(); 
        System.out.println();






        //list2
        AddNumbers slist1=new AddNumbers();
        slist1.head=new Node(2);
        Node secondn1=new Node(4);
        Node thirdn1=new Node(7);
        slist1.head.next = secondn1;
        secondn1.next=thirdn1;
        slist1.printList();
        
        Node start = AddLists(slist.head, slist1.head);
        while(start != null){
            System.out.print(start.data+"--->");
            start = start.next;
        }
    }

    private static AddNumbers.Node AddLists(AddNumbers.Node head2, AddNumbers.Node head3) {
        
        Node dummy = new Node(0);
        int carry = 0;

        Node newHead = dummy;
        Node a = head2;
        Node b = head3;
        int sum = 0;

        while(a != null || b != null){
            int x = (a != null)? a.data : 0;
            int y = (b != null)? b.data : 0;
            sum = x + y;
            carry = sum / 10;
            newHead.next = new Node(sum % 10);
            newHead = newHead.next;
            a = a.next;
            b = b.next;
        }        
        if(carry > 0){
            newHead.next = new Node(carry);
        }
        return dummy.next;
    }
    
    public void printList(){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null"+"\n");
    }
}