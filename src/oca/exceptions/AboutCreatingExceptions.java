package oca.exceptions;

import java.io.FileReader;

class NumberToBig extends RuntimeException {
    public NumberToBig(String message) {
        super(message);
    }
}

public class AboutCreatingExceptions {

    public static void checkNumber(int number) {
        if (number > 100) {
//            throw new NumberToBig("This number is to big");
            throw new RuntimeException("Something went wrong!");
        }
    }

    public static void main(String[] args) {

//        try {
//            FileReader fileReader = new FileReader("./in.txt");
//        } catch(Exception ex) {
//            ex.printStackTrace();
//        }

        try {
            checkNumber(Integer.parseInt(args[0]));
        } catch (Exception toBig) {
            System.out.println("To big!");
        }

        System.out.println("To the end!");


    }


}
