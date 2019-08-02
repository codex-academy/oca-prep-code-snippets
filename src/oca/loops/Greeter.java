package oca.loops;

import java.util.Scanner;

public class Greeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        while(keepGoing) {

            String command = scanner.nextLine();

            if ("exit".equalsIgnoreCase(command)){
                System.out.println("Bye!");
                keepGoing = false;
                return;
            }

            if (command.length() == 7 ){
                System.out.println("Whoop, whoop!");
                keepGoing = false;
            } else {
                System.out.println("Hi!");
            }



        }


    }
}
