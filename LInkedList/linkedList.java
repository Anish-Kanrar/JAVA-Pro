package LInkedList;

public class linkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //Step1:create a new node
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        //Step2: newNode next = head
        newNode.next=head; //link

        //Step3:head = newNode
        head=newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == newNode){
            head= tail=null;
        }
        tail.next=newNode;
        tail = newNode;
    }
    public void add(int data){

    }

    public void print(){ //O(n)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println();
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
//        System.out.println(ll.size);
    }
}
