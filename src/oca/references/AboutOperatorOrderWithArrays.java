package oca.references;

import java.util.ArrayList;
import java.util.List;

public class AboutOperatorOrderWithArrays {


    public static void scenario1(){
        int[] numbers = {7,2,3,4};
        int i = 0;
        numbers[i++] = numbers[i] + 2;
        // what does this print?!
        System.out.println(numbers[0]);
    }

    public static void scenario2(){
        int[] numbers = {7,2,3,4};
        int i = 3;
        numbers[i--] = numbers[i] + 2;
        // what does this print?!
        System.out.println(numbers[3]);
    }

    public static void scenario3(){
        int[] numbers = {7,2,3,4};
        int i = 1;
        numbers[i--] = numbers[i] + 2;
        // what does this print?!
        System.out.println(numbers[0]);
    }

    public static void scenario4(){
        int[] numbers = {7,2,3,4};
        int i = 1;
        numbers[i--] = numbers[i] + 2;
        // what does this print?!
        System.out.println(numbers[1]);
    }

    public static void scenario5(){
        int[] numbers = {7,2,3,4};
        int i = 0;

        numbers[i++] = numbers[i++] + 2;
        numbers[i] = numbers[i++] + 3;

        // what does this print?!
        System.out.print(numbers[0]); // 4
        System.out.print(" ");

        System.out.print(numbers[2]); // 6
    }

    public static void main(String[] args) {

//        scenario1();
        scenario5();

        List<String> strings = new ArrayList();
        strings.add("...");
    }

}
