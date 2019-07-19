package oca;

public class Car {

    private static int startCount;

    public static String start() {
        startCount++;
        return "started the car!";
    }



    public static void main(String[] args) {

        Car car1 = new Car();
        car1.start();

        Car car2 = new Car();
        car2.start();

        Car car3 = new Car();
        car3.start();

        Car car4 = new Car();
        car4.start();

        System.out.println(car1.startCount);
    }

}
