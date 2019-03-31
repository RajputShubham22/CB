//package Lecture_16;
//import java.util.Queue;
//public class StackUsingQueue_Push {
//    Queue<Integer> queue=new Queue<>();
//
//    public void push(int item){
//        queue.add(item);
//    }
//
//    public Integer pop(){
//        int val;
//        Queue<Integer> temp=new Queue<>();
//        while(!queue.isEmpty()){
//            val=queue.remove();
//        if(queue.isEmpty()){
//            break;
//        }
//        temp.add(val);
//        }
//        while(!temp.isEmpty()){
//            queue.add(temp.remove());
//        }
//        return val;
//    }
//}
//
