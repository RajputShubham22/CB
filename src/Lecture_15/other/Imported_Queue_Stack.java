package Lecture_15.other;
import javax.jnlp.IntegrationService;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class Imported_Queue_Stack {
    public static void main(String[] args) {
        Stack<Integer> stackname = new Stack<>();
        stackname.push(10);
        stackname.push(20);
        System.out.println(stackname.pop());
        Queue<Integer>  queue=new LinkedList<>();
        //LinkedList is Dequeue and a dequeue is a queue so we use
        // LL here because LL is also a queue
        queue.add(6);
        queue.add(7);
        System.out.println(queue.remove());
    }
}

