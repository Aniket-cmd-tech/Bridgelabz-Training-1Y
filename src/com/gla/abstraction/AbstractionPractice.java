package com.gla.abstraction;
abstract class Fruit{
    abstract void test();
    void color(){
        System.out.println("Yellow");
    }
}
class Mango extends Fruit{

    @Override
    void test() {
        System.out.println("Sweet");
    }
}
class PineApple extends Fruit{

    @Override
    void test() {
        System.out.println("Test is Sweet");
    }
}
public class AbstractionPractice {
    static void main(String[] args) {
        Mango m1=new Mango();
        m1.test();
        Fruit f1=new Mango();
            f1.color();
            f1.test();

        PineApple p1=new PineApple();
        p1.test();

    }
}

