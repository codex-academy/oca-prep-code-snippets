package oca.logical_ops;

import java.util.ArrayList;
import java.util.List;

public class AboutLogicalOperators {
    public static void main(String[] args) {

        int a = 9;
        int b = 4;

        boolean result = a > 10 ^ b > 3;
        System.out.println( result );


        List<Integer> elements = new ArrayList<>(5);
        elements.add(10);
        int firstElmnt = elements.get(1);
        System.out.println(firstElmnt);

    }
}
