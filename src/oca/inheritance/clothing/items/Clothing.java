package oca.inheritance.clothing.items;


public abstract class Clothing {

    char size;
    double price;

    public Clothing() {
        this(250);
    }

    public Clothing(double price){
        this.price = price;
        this.size = 'M';
    }

    public double getPrice() {
        return price;
    }

    protected void setSize(char size) {
        this.size = size;
    }

    public void display() {
        System.out.println("Display from Clothing");
        System.out.println("This item is of size " + size + " and it costs : " + this.price);
    }

    public abstract void scan();


}




