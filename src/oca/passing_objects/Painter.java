package oca.passing_objects;

public class Painter {

    private final String color;

    public Painter(String color){
        this.color = color;
    }

    public House paint(House house){
        house.setColor(color);
        // return new House(color);
        return house;
    }

    public double pay(double amount) {
        System.out.println(amount);

        return amount - 100;
    }

}
