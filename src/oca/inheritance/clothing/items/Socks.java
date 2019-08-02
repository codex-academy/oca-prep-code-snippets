package oca.inheritance.clothing.items;

import oca.inheritance.Returnable;

public class Socks extends Clothing implements Returnable {

    private boolean smelly = false;

    public Socks(boolean smelly) {
        this.smelly = smelly;
    }

    public void display(){
        if (smelly) {
            System.out.println("This is my smelly socks of size " + super.size);
        } else {
            System.out.println("This is my socks of size " + super.size);
        }
    }

    @Override
    public void scan() {
        System.out.println("Scanned socks");
    }

    public boolean smelly (){
        return this.smelly;
    }

    public boolean isReturnable() {
        if (this.smelly) {
            return false;
        }
        return true;
    }
}
