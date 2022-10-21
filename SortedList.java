//insert in a sortedList
//Merge 2 sortedLists 


import java.time.chrono.HijrahEra;
import java.util.logging.Handler;

public class SortedList{
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
        SortedList slist=new SortedList();
        slist.head=new Node(1);
        Node secondn=new Node(3);
        Node thirdn=new Node(5);
        Node fourthn=new Node(7);
        Node fifthn=new Node(9);
        slist.head.next = secondn;
        secondn.next=thirdn;
        thirdn.next=fourthn;
        fourthn.next = fifthn;
        System.out.println("Print the list:");
        slist.printList(); 
        System.out.println();

        System.out.println("Insert in sorted Singly list:");
        slist.insInSortedList(4);
        slist.printList();
        slist.insInSortedList(6); 
        slist.printList();
        slist.insInSortedList(8); 
        slist.printList();
        System.out.println();

        //list2
        SortedList slist1=new SortedList();
        slist1.head=new Node(2);
        Node secondn1=new Node(10);
        Node thirdn1=new Node(20);
        Node fourthn1=new Node(30);
        Node fifthn1=new Node(40);
        slist1.head.next = secondn1;
        secondn1.next=thirdn1;
        thirdn1.next=fourthn1;
        fourthn1.next = fifthn1;
        slist1.printList();
        Node start = MergeLists(slist.head, slist1.head);
        while(start != null){
            System.out.print(start.data+"--->");
            start = start.next;
        }
    }

    private static Node MergeLists(SortedList.Node head2, SortedList.Node head3) {
        Node dummy = new Node(0);
        Node newHead = dummy;
        Node a = head2;
        Node b = head3;
        while(a != null && b != null){
            if(a.data <= b.data){
                newHead.next = a;
                a = a.next; 
                newHead = newHead.next;
            }
            else{
                newHead.next = b;
                b = b.next;
                newHead = newHead.next;
            }
        }
        if(a == null ){
            newHead.next = b;
        }
        if(b ==  null){
            newHead.next = a;
        }
        return dummy.next;
    }

    private void insInSortedList(int i){
        Node temp = head;
        Node temp1 = null;
        while(temp.data < i && temp.next.data < i){ 
            temp = temp.next;
        }
        temp1 = temp.next;
        Node newN = new Node(i);
        temp.next = newN;
        newN.next = temp1;
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