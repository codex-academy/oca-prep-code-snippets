package oca.cars;

class Car {
    public void drive(){
        System.out.println("froom!");
    }
}

class FancyCar extends Car {
    public void drive(){
        System.out.println("fancy froom!");
    }

    public void aboutFancy() {
        System.out.println("Super fancy is my thing");
    }

}

class SuperFancyCar extends FancyCar {
    public void drive(){
        System.out.println("super fancy froom!");

    }

    public void aboutSuperFancy() {
        System.out.println("Super fancy is my thing");
    }
}

public class AboutCars {

    public static void main(String[] args) {

        Car car1 = new FancyCar();
        Car car2 = new Car();
        Car car3 = new SuperFancyCar();

        System.out.println(car1 instanceof Car);
        System.out.println(car1 instanceof FancyCar);
        System.out.println(car1 instanceof SuperFancyCar);

        System.out.println(car2 instanceof Car);
        System.out.println(car2 instanceof FancyCar);
        System.out.println(car2 instanceof SuperFancyCar);

        System.out.println(car3 instanceof Car);
        System.out.println(car3 instanceof FancyCar);
        System.out.println(car3 instanceof SuperFancyCar);


        car1.drive();
        car2.drive();
        car3.drive();

//        Car car2 = new FancyCar();
//        car2.drive();
//
//        FancyCar car3 = (FancyCar)car2;
//
//        SuperFancyCar car4 = (SuperFancyCar) car1;
//        car4.driveSuperFancy();

    }



}
