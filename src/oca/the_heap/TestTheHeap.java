package oca.the_heap;

import java.io.IOException;

class TheValue {
    TheValue value;

    public TheValue(TheValue value) {
        this.value = value;
    }

    public TheValue getValue() {
        return value;
    }
}


public class TestTheHeap {
    public static void main(String[] args) {

        TheValue[] objects = new TheValue[300000];

        TheValue value = new TheValue(new TheValue(null));

        while (true) {
            for (int i = 0; i < objects.length; i++) {

//            try {
//                Thread.sleep(100);

                objects[i] = new TheValue(value);
                value = objects[i];

                System.out.println("Created new Object!!!");
                System.out.println(i);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            }

            for (int i = objects.length-1; i > 0; i--) {

//            try {
//                Thread.sleep(100);

                objects[i] = null;

                System.out.println("Cleaning up!!!");
                System.out.println(i);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            }
            break;
        }

//        value = null;

        try {
            System.out.println("waiting");
            System.in.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
