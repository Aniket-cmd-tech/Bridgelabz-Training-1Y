package com.gla.MultiThreading;

public class Thread3 extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("thread3:'" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void main(String[] args) {
        Thread3 Thread3=new Thread3();
        Thread3.start();
        Thread4 Thread4=new Thread4();
        Thread Thread=new Thread(Thread4);

        Thread.start();
    }

}
