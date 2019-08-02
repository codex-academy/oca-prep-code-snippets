package oca.inheritance.clothing.items;

import oca.inheritance.Returnable;

public abstract class Shirt extends Clothing implements Returnable {
    public Shirt(char size, double price) {
        super(price);
        setSize(size);
    }

    public Shirt(double price) {
        this('M', price);
    }

    @Override
    public void display() {
        System.out.println("display from Shirt class");
        System.out.println("This is a shirt of size : " + super.size + " and it costs " + getPrice());
        System.out.println("**************");
    }

    @Override
    public void scan() {
        System.out.println("==> in Shirt scan");
        System.out.println("Scanned a shirt : " + isReturnable());
    }


}
