package Lecture_15.other;

import Lecture_15.other.Stack;

public class Dynamic_Stack extends Stack {
public void push(int item){
 if(isfull()){
     int[] temp=new int[data.length*2];
     for (int i = 0; i <data.length ; i++) {
         temp[i]=data[i];
     }
     data=temp;
 }
super.push(item);
}
}
