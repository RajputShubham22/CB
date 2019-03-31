package Lecture_14;

public class Circular_Queue {
    public int[] data;
    private static final int DEFAULT_SIZE=10;
    private int front;
    private int end;
    private int size;
    public Circular_Queue(){
        this(DEFAULT_SIZE);
        /////Avoid data redundancy, as this constructor will call the parameterized constructor

    }
    public Circular_Queue(int size){
        data=new int[size];
        end=-1;
        front=0;
        size=0;
    }
    boolean isfull(){
        return size==data.length;
    }
    boolean isempty(){
        return size==0;
    }
public void enqueue(int value){
       if(!isfull()) {
           end = (end + 1) % data.length;

           data[end] = value;
           size++;
       }

}
public Integer dequeue(){
        if(isempty()){
            return null;
        }
        else{
            int val=data[front];
            front=(front+1)%data.length;
            size--;
            return val;
            }
        }
public void display(){
    for (int i = 0 ; i < size; i++) {
        System.out.print(data[(front+i)%data.length]);
        if(i<size-1){
            System.out.print(", ");
        }
    }
}
}

