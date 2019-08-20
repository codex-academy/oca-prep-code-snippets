package oca.inheritance;

public class Car {

    private boolean go = false;
    private int speed = 0;

    public void accellerate(){

        accellerate(100);

    }

    public void accellerate(int speed) {
        go = true;
        this.speed = speed;
    }

    public static void main(String[] args) {

        // (new Car()).accellerate();

        new Car().accellerate();

    }

}
