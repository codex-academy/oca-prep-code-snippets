package oca.inheritance.farm;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

class Animal {
    public void eats() {
        System.out.println("nomm! nomm! nommm!");
    }

    public Animal herdOne() {
        return new Animal();
    }

    @Override
    public String toString() {
        return "An animal";
    }
}

class Horse extends Animal {
    public Horse herdOne() {
        return new Horse();
    }

    @Override
    public String toString() {
        return "A horse";
    }
}

class Stallion extends Horse {

}


class Cow  {

}


public class Farm {
    public static void main(String[] args) {

        Animal animal = new Horse();
        System.out.println(animal.herdOne());

        Horse horse = new Horse();
        System.out.println(horse.herdOne());


//try {
//  // your code here
//    File file = new File("./file.txt");
//
//    file.getTotalSpace();
//} catch(SQLException sqlEx) {
//  // this only handle SQL Exceptions
//} catch (IOException ioEx) {
//  // catch IO Exceptions
//}



    }
}
