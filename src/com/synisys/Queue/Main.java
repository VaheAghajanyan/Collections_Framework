package com.synisys.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.println(myQueue.peek());
        myQueue.remove();
        System.out.println(myQueue.peek());

        // We will not get sorted order if we print the PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(3);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        //Deque

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.addFirst(3);
        deque.addLast(4);
        System.out.println(deque);
    }
}
