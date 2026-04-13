package com.gla.collection;

import org.w3c.dom.html.HTMLAppletElement;

import java.util.*;
public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("proxima");
        queue.add("Detonate");
        queue.add("HIGH-FY");
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.peek());
    }
}
