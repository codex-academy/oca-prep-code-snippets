package oca.inheritence.clothing.items;

import oca.inheritence.Returnable;

public class Trousers extends Clothing implements Returnable {

    @Override
    public void scan() {
        System.out.println("Scanned trousers");
    }

    public boolean isReturnable() {
        return true;
    }
}
