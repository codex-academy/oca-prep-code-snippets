package oca.exceptions;

class Person {
    void say() {

    }
}

class Abode {

}

class Home extends Abode {

}

class Flat extends Abode {

}

public class AboutExceptions {

    public static void doStuff(String name) {
        name.length();
    }

    public static void main(String[] args) {

        String[] names = new String[3];
        try {
            names[2] = "andre";
            names[5] = "";
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Got here");

        System.out.println(names[2]);

        String name = "Joe";

        try {
            doStuff(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Abode flat = new Flat();
        Abode home = new Home();

        Flat flatTwo = (Flat)home;

        // Person person = (Person)name;
    }

}
