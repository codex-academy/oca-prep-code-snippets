package oca.inheritance.clothing;

import oca.inheritance.*;
import oca.inheritance.clothing.items.*;

public class App {

    public static void main(String[] args) {

        Clothing shirt = new TheShirt('L', 129.50);
        Clothing trousers = new Trousers();
        Clothing socks = new Socks(false);

        System.out.println("-------------------");
        System.out.println( shirt instanceof Returnable );
        System.out.println( trousers instanceof Returnable );
        System.out.println( socks instanceof Returnable );
        System.out.println("-------------------");

        System.out.println( socks instanceof Socks );
        System.out.println("========");

        shirt.display();
        shirt.scan();

        trousers.display();
        socks.display();
        socks.scan();

//        System.out.println("Is my socks smelly: " + ((Socks)socks).smelly());

        Closet myCloset = new Closet();

        myCloset.addClothing(shirt);
        myCloset.addClothing(socks);
        myCloset.addClothing(trousers);
        myCloset.addClothing(new Socks(false));

        System.out.println(myCloset.sockCount());


//        if (socks instanceof Socks) {
//            Socks theSocks = (Socks) socks;
//            theSocks.smelly();
//        } else {
//            System.out.println("This is no sock!");
//        }


        // shirt.setSize('U');

        // shirt.display();


    }
}
