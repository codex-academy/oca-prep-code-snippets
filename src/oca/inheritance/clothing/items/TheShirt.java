package oca.inheritance.clothing.items;

public class TheShirt extends Shirt {

    public TheShirt(char size, double price) {
        super(size, price);
    }

    @Override
    public boolean isReturnable() {
        System.out.println("===> in TheShirt's isReturnable");
        return false;
    }
}
