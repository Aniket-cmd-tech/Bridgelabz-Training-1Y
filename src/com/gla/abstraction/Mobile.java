package com.gla.abstraction;

public interface Mobile {
    String os="IOS";
    String color="Black";
    void Model();
    void Chip();
}
class Apple implements Mobile{

    @Override
    public void Model() {
        System.out.println("IPhone 18 Pro Max");
    }

    @Override
    public void Chip() {
        System.out.println("A18 Bionic Chip");
    }
}
class mai{
    static void main(String[] args) {
        Mobile m=new Apple();
        m.Chip();
        m.Model();
    }
}
