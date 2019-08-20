package oca.references;

import java.util.Arrays;

public class AboutReferences {

    public static void add(int number) {
        number++;
        System.out.println(number);
    }

    public static void add(int[] numbers, int index) {
        // does nothing as this is a post increment
        numbers[0] = numbers[0]++;

        numbers[++index] = numbers[index] * 2;
        System.out.print(numbers[index]);
        System.out.print(" ");

        numbers[index++] = (numbers[index] + 30);
        System.out.print(numbers[2]);

        //System.out.println(Arrays.toString(numbers));

    }

    public static void main(String[] args) {

        int theNumber = 9;
        add(theNumber);
        System.out.println(theNumber);

        System.out.println("---");

        int theIndex = 1;
        int[] theNumbers = {3,1,5,7};

        add(theNumbers, 1);

        System.out.print(theNumbers[1]);


    }
}
