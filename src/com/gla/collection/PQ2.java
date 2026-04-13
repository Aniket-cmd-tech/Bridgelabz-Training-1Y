package com.gla.collection;

import java.util.PriorityQueue;
import java.util.*;
public class PQ2 {
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(98);
        pq.offer(99);
        pq.offer(34);
        pq.offer(9);
        pq.poll();
        System.out.println(pq.element());
    }
}
