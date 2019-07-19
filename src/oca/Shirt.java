package oca;

public class Shirt {

    private static int shirtCount = 0;

    public String color;
    public String size;

    public static Shirt getInstance(String color, String size) {


        return new Shirt(color, size);
    }

    private Shirt(String color, String size){
        this.color = color;
        this.size = size;
        System.out.println("------");
        display();
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return (String.format("`%s` shirt of size: %s", this.color, this.size));
    }




}
