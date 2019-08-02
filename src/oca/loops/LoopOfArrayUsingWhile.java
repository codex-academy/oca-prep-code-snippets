package oca.loops;

public class LoopOfArrayUsingWhile {
    public static void main(String[] args) {

        String names[] = {"Andre", "Yegan", "Richard", "Lunga", "Lihle", "Ntando"};

        System.out.println("while loop");
        System.out.println("************");

        int counter = 0;
        while(counter < names.length) {
            System.out.println(names[counter++]);
        }

        // this will fail for an empty Array
        System.out.println("Do while:");
        System.out.println("************");

        int counter1 = 0;
        do{
            System.out.println(names[counter1++]);
        } while(counter1 < names.length);


        System.out.println("For loop");
        System.out.println("************");

        for(int i=0;i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Enhanced for");
        System.out.println("************");

        for(String name : names) {
            System.out.println(name);
        }


    }
}
