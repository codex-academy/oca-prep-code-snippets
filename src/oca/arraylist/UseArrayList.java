package oca.arraylist;

import java.util.ArrayList;

class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getColor();
    }
}


public class UseArrayList {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();

        // apples.add();

        Apple yellowApple = new Apple("Yellow");



        apples.add(new Apple("Red"));
        apples.add(yellowApple);
        apples.add(new Apple("Green"));

        System.out.println(apples.indexOf(yellowApple));

        apples.remove(0);
        apples.remove(1);

        System.out.println(apples.indexOf(yellowApple));

        System.out.println("---- ----");

        ArrayList numbers = new ArrayList();

        numbers.add(new Integer(100));
        numbers.add(200);
        numbers.add(new Integer(100));
        numbers.add(new Integer(100));
        numbers.add(new Integer(100));


        System.out.println(numbers.size());

        numbers.remove(new Integer(100));
        numbers.remove(new Integer(100));

        System.out.println(numbers.size());


    }

}
