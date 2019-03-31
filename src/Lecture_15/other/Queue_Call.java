package Lecture_15.other;

public class Queue_Call {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.push(10);
        queue.push(18);
        queue.push(11);
        queue.push(16);
        queue.push(14);
        queue.push(12);
        queue.display();
        queue.delete();
        queue.display();
        queue.push(16);
        queue.push(14);
        queue.push(12);
        queue.delete();
        queue.delete();
        queue.display();
    }
}
