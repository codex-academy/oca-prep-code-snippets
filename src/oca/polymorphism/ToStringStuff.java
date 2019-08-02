package oca.polymorphism;


class One {

    String name;

    public One(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Yo " + name;
//    }
}

public class ToStringStuff {

    public static void main(String[] args) {

        Object obj = new Object();
        System.out.println(obj);

        System.out.println(new StringBuilder("This is a string"));

        System.out.println(new One("Andy"));

    }
}
