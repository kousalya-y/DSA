import java.net.PortUnreachableException;

import javax.swing.plaf.SliderUI;

public class loopinSList {

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
        loopinSList slist=new loopinSList();
        slist.head=new Node(1);
        Node secondn=new Node(3);
        Node thirdn=new Node(5);
        Node fourthn=new Node(7);
        Node fifthn=new Node(9);
        slist.head.next = secondn;
        secondn.next=thirdn;
        thirdn.next=fourthn;
        fourthn.next = fifthn;
        fifthn.next = thirdn;
        Node meetNode = slist.detectLoop();
        if(meetNode!=null){
        Node start = slist.findStart(meetNode);
        System.out.println(start.data);
        slist.removeLoop(meetNode);
        Node LNode = slist.detectLoop();
        if(LNode == null) {
            slist.printList();
        }
        }
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null"+"\n");
    }

    private void removeLoop(loopinSList.Node meetNode) {
        Node temp = head;
        while(temp.next != meetNode.next){
            temp = temp.next;
            meetNode = meetNode.next;
        }
        meetNode.next = null;
    }

    private Node findStart(loopinSList.Node meetNode) {
        Node temp = head;
        while(temp != meetNode){
            temp = temp.next;
            meetNode = meetNode.next;
            if(temp == meetNode){
                return temp;
            }
        }
        return temp;
    }

    public Node detectLoop(){
        Node fastptr = head;
        Node slowptr = head;
        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr){
                System.out.println("Loop exists");
                return fastptr;
            }
        }
        System.out.println("No loop");
        return null;
    }
}
