package oca.conditional_statements;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HowManyDaysInMonth {
    public static int days(int monthOfYear, int year) {

        switch (monthOfYear) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
                // System.out.println("31 days");

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 29;

        }


//        if (monthOfYear == 1
//                || monthOfYear == 3
//                || monthOfYear == 5
//                || monthOfYear == 7
//                || monthOfYear == 8
//                || monthOfYear == 10
//                || monthOfYear == 12
//        ) {
//            return 31;
//        }
//        else if (monthOfYear == 4
//                        || monthOfYear == 6
//                        || monthOfYear == 9
//                        || monthOfYear == 11
//                ) {
//            return 30;
//        } else {
//            if (year % 4 == 0) {
//                return 29;
//            }
//            return 28;
//        }

    }

    public HowManyDaysInMonth() {
    }

    public static void main(String[] args) {

        System.out.println(
                days(1, 2008) == 31
                && days(2, 2008) == 29
                && days(3, 2008) == 31
                && days(4, 2008) == 30
                && days(5, 2008) == 31
                && days(6, 2008) == 30
                && days(7, 2008) == 31
                && days(8, 2008) == 31
                && days(9, 2008) == 30
                && days(10, 2008) == 31
                && days(11, 2008) == 30
                && days(12, 2008) == 31);

        String[] names =  {"2", "34", "23"};

        ArrayList aa = new ArrayList();

        Predicate p = (o) -> {
            return false;
        };

        aa.stream().filter(p);

        greet((name) ->
        {
            return name.toUpperCase();
        });

    }

    @FunctionalInterface
    interface GreetFunc {
        String greet(String name);
    }


    public static void greet(GreetFunc f) {
        f.greet("Andre");
    }
}
