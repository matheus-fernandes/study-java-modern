package study.collections;

import java.util.List;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        List<Integer> list = stack;
        System.out.println(list.add(5));
        System.out.println(stack);
    }
}
