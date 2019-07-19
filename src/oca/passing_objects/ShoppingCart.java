package oca.passing_objects;

class Shirt {
    char colorCode = 'U';
}

public class ShoppingCart {
    public static void main(String[] args) {

        Shirt myShirt = new Shirt();
        System.out.println("Shirt color: " + myShirt.colorCode);

        changeShirtColor(myShirt.colorCode, 'B');

        System.out.println("Shirt color: " + myShirt.colorCode);
    }

    public static void changeShirtColor(char currentColor, char color) {
        currentColor = color;
    }
}
