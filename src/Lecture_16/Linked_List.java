package Lecture_16;

public class Linked_List {

           private class Node {
            String value;
            Node next;

            public Node(String value) {
                this.value = value;
            }

            public Node(String value, Node next) {
                this.value = value;
                this.next = next;
            }
        }

    private Node head;  //head is a reference here//

    public void InsertFirst (String value){
        //new node points to the old head//
        Node node = new Node(value);
        node.next = head;
        //now new node is the head//
        head = node;
    }

    public void InsertLast(String value){
        if(head==null){
            InsertFirst(value);
            return;
        }
        Node node=head;
        while(node.next!=null){
            node=node.next;
        }
        Node tail =new Node(value);
        node.next=tail;
    }

    public String deletefirst(){
        if(head==null){
            return null;
        }
        String holder=head.value;
        head=head.next;
        return holder;
    }

    public String deletelast(){
        if(head==null || head.next==null){
            return deletefirst();
        }
        Node node = head;
        while(node.next.next!=null){
            node=node.next;
        }
        String value=node.next.value;
        node.next=null;
        return value;

    }
    public void insert(int index,String value){
        if(index==0){
            InsertFirst(value);
            return;
        }
        Node previous=head;
        for (int i = 1; i <index ; i++) {
            previous=previous.next;
        }
        Node node=new Node(value,previous.next);
        previous.next=node;
    }
    public String delete(int index){
        if(index==0){
            return deletefirst();

        }
        Node previous=head;
        for (int i = 1; i <index ; i++) {
            previous=previous.next;
        }
        String value=previous.next.value;
        previous.next=previous.next.next;
        return value;
    }

    public String middle() {
        Node slow = head;
        Node fast = head;

        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

        }
    return slow.value;
    }

    public void reverse(){
       Node previous=null;
       Node present=head;


       while(present!=null){
       Node Next=present.next;
      present.next=previous;
      previous=present;
      present=Next;

       }
       head=previous;
    }

    //public static Linked_List merge(Linked_List first, Linked_List second){
//        Node h1=first.head;
//        Node h2=second.head;
//        Node h=null;//h-->head//
//        Node t=null;//t-->tail//
//        while(h1!=null && h2!=null) {
//            if (h1.value.compareTo(h2.value) < 0) {
//                //Shift from h1//
//            } else {
//                //Shift from h2//
//
//            }
//        }
//        while(h1!=null){
//            //shift from h1//
//
//        }
//        while(h2!=null){
//            //shift from h2//
//        }
//    }
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value+ "-->");
            node=node.next;
        }
        System.out.println("NULL");
    }
    }
