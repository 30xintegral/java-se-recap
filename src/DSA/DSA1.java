package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DSA1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(213);
        queue.add(45);
        queue.add(15);
        System.out.println(queue.poll());
        System.out.println(queue);
        stack.push(213);
        stack.push(45);
        stack.push(15);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
