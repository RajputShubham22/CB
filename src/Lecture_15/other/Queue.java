package Lecture_15.other;

public class Queue {

    public int[] data;
    private static final int DEFAULT_SIZE=10;
    private int end;

    public Queue(){
        data=new int[DEFAULT_SIZE];
        end=-1;
    }
    public Queue(int size){
        data=new int[size];
        end=-1;
    }

    boolean isfull(){
    return  end==data.length-1;
    }
    boolean isempty(){
        return end==-1;
    }
public void push(int item) {
    if (!isfull()) {
        data[++end] = item;
    }
}
public Integer delete(){
        if(isempty()){
            return null;
        }
        else{
            int val=data[0];
            for (int i = 1; i <=end ; i++) {

            data[i-1]=data[i];}
            end--;
            return val;
 }
    }

        public void display(){
            for (int i = 0; i <=end ; i++) {
                System.out.print(data[i]+" ");
            }
            System.out.println();
    }
}

