package Lecture_15.other;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int top =-1;

    public Stack(){
        data=new int [DEFAULT_SIZE];
    }
    public Stack(int size){
        data=new int[size];
    }

    public boolean isfull()
    {
        return top==data.length-1;
    }
    public boolean isempty(){
        return top==-1;
    }
    public void push (int item){

        if(!isfull()){
     data[++top]=item;
 }
    }
    public Integer pop(){ //Integer returns NULL value also
        if(isempty()){
            return null;
        }

            return data[top--];


    }
}



