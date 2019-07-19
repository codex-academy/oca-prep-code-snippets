package oca;

public class Primitives {
    public static void main(String[] args) {


        int i;
        double d;
        char c;
        long l;
        byte b;

//        int age = 37;

//        Integer age = 37;



//        double length = 1.79;
//
//
//        //
//
//        String name = "console";
//        String nameA = name;
//
//        System.out.println(nameA.hashCode());
//        System.out.println(name.hashCode());
//
//        System.out.println("- - - - - - - - ");
//
//        name  = name.concat(".log");
////
//        System.out.println(name.hashCode());
//        System.out.println(nameA.hashCode());
//
//        String howdy = new String(" HOW ");
//
//        System.out.println(howdy);
//        String trimmedHowdy = howdy.trim();
//        System.out.println(howdy.hashCode());
//        System.out.println(trimmedHowdy.hashCode());
//
//        // " HOWDY ".trim();
//
//        // 7.times()
//
//
//        String greet = " HOW-HOW-WWWWW ".trim();
//        String lc = greet + "DY";
//        System.out.println(lc);
//
//        // int value = lc.las("d");
//        System.out.println(lc.indexOf("W", 7)); // 2
//
//        System.out.println(lc.lastIndexOf("W"));    // 6**? or 2?


        String name = "Rihanna";
        String customerName = name + " Grandé";



        String firstName = customerName.substring(0, customerName.indexOf(" "));
        System.out.println(firstName);
        if (!firstName.equals(name)) throw new AssertionError();

        String theName;
        int y;

        StringBuilder sb = new StringBuilder();

        System.out.println("->" + sb.toString() + "<-");

        final int vatRate = 15;


        double rate = 13.25;

        double val = rate % 3.25;
        System.out.println(val);

//        a = a + b;
//        a = a - b;
//        a = a * b;
//        a = a / b;
//        a = a % b;

    }
}
