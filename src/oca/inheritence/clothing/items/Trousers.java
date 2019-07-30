package oca.inheritence;

import oca.inheritence.clothing.Clothing;

public class Trousers extends Clothing implements Returnable  {

    @Override
    public void scan() {
        System.out.println("Scanned trousers");
    }

    public boolean isReturnable() {
        return true;
    }
}
