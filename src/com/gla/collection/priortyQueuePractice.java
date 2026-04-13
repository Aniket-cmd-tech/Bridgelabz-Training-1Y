package com.gla.collection;
import java.util.*;
public class priortyQueuePractice {
    static void main(String[] args) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        pq.offer(98);
        pq.offer(99);
        pq.offer(34);
        pq.offer(9);
        pq.poll();
        System.out.println(pq.element());
    }
}
