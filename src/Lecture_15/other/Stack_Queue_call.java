package Lecture_15.other;

public class Stack_Queue_call {
    public static void main(String[] args) {
//        TwoStacks_Insertion ins = new TwoStacks_Insertion();
//        ins.add(20);
//        ins.add(10);
//        ins.add(30);
//        ins.add(40);
//        System.out.println(ins.remove());
//        System.out.println(ins.front());


            TwoStacks_Deletion td=new TwoStacks_Deletion();
            td.add(10);
            td.add(20);
            td.add(30);
            System.out.println(td.remove());
        System.out.println(td.front());
    }
}
