package com.gla.MultiThreading;

public class Thread4 implements Runnable{
    @Override
    public void run() {
        for(int i=9;i<10;i++){
            System.out.println("Thread4:"+i);
        }
    }
}
