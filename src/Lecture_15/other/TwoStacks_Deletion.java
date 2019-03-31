package Lecture_15.other;

import java.util.Stack;

public class TwoStacks_Deletion {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void add(int item) {

        while (!stack.isEmpty()) {
            stack2.push(stack.pop());

        }
        stack.push(item);
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
    }

    public Integer remove() {
        int val = stack.peek();
        stack.pop();
        return val;
    }
    public  Integer front(){
        int var=stack.peek();
        return var;
    }
}



