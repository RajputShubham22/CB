package Lecture_15.other;

public class Stack_Call {
    public static void main(String[] args) {
//        Stack s=new Stack(10);
//        s.push(676);
//        s.push(376);
//        s.push(476);
//        s.push(674);
//        s.push(679);
//        s.push(656);
//        s.push(66);
//        s.push(67);
//        s.push(675);
//        System.out.println(s.pop());
    Dynamic_Stack s=new Dynamic_Stack();
        for (int i = 0; i <2000 ; i++) {
            s.push(i);
        }
        for (int j = 0; j <2000 ; j++) {
            System.out.println(s.pop());
        }
    }
}
