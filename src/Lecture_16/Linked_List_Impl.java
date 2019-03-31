package Lecture_16;

public class Linked_List_Impl {
    public static void main(String[] args) {
        Linked_List list=new Linked_List();
        list.display();
        list.InsertFirst("a");
        list.InsertLast("b");
        list.InsertFirst("c");
        list.InsertFirst("d");
        list.InsertLast("e");
        list.InsertFirst("f");
        list.display();
        System.out.println(list.deletefirst());
        System.out.println(list.deletelast());
        list.display();
        list.insert(1,"z");
        list.display();
        System.out.println(list.delete(1));
        System.out.println(list.middle());
        list.reverse();
    }
}
