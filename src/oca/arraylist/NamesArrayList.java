package oca.arraylist;

import java.util.ArrayList;

public class NamesArrayList {
    public static void main(String[] args) {

        ArrayList names = new ArrayList();


        names.add("Pumla");
        names.add("Lindani");
        names.add("Joe");
        names.add(0,"Pumlani");

        System.out.println(names.get(2));  // Lindani
        System.out.println(names.get(1));  // Pumla
        System.out.println(names.get(3));  //

        for (String name : "Andre, Ben, Joe".split(",")){
            System.out.println(name.trim());
        }

    }
}
