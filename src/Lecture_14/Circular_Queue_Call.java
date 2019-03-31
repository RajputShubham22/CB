package Lecture_14;

public class Circular_Queue_Call {
    public static void main(String[] args) {
  Circular_Queue cq=new Circular_Queue();
//        cq.enqueue(10);
//        cq.enqueue(11);
//        cq.enqueue(12);
//        cq.enqueue(13);
//        cq.enqueue(14);
        cq.enqueue(15);
        cq.enqueue(16);
        cq.enqueue(17);
        cq.dequeue();
        cq.dequeue();
        cq.display();
    }
}
