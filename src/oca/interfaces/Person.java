package oca.interfaces;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface Movement {
    String move(int speed);
}

class MyMovement implements Movement {

    @Override
    public String move(int s) {
        if (s < 1) {
            return "You are probably sitting";
        } else if (s > 1 && s <10) {
            return "your walking";
        }
        return "your probably running for the bus";
    }
}

interface Walk extends Movement {
    void walk();
}

interface Run extends Walk  {
    void run();
}

class FunRun {

    void enter(Run runner) {

    }
}

class FunWalk {

    void enter(Walk walker) {

    }
}

public class Person implements Run {


    @Override
    public void run() {
        System.out.println("running...");
    }

    @Override
    public String move(int speed) {
        System.out.println("moving..");
        return "";
    }

    @Override
    public void walk() {
        System.out.println("walking...");
    }



    public static void main(String[] args) {

        Movement movement2 = (s) -> s > 5 ? "run" : "walk";



        Movement movement = new MyMovement();

        System.out.println(movement.move(20));


        Predicate<Integer> isLongerThanFive = (desc) -> desc > 5;

        System.out.println(isLongerThanFive.test(7));
        System.out.println(isLongerThanFive.test(4));

        Function<String, String> upper = (desc) -> desc.toUpperCase();

        Function<String, ArrayList<String>> split = (String desc) -> {
            var list = Arrays.asList(desc.split(" "));
            return new ArrayList<>(list);
        };

        System.out.println(upper.apply("Long Walk after lunch"));
        System.out.println(split.apply("Long walk after lunch"));

        Function<String, String> greetTwo = (s) -> "Hi, " + s;
        
        UnaryOperator<Integer> checkNumber = (s) -> s > 10 ? 5 : 0;

        System.out.println(checkNumber.apply(10));
        System.out.println(checkNumber.apply(14));

//        Person person = new Person();
//        person.move();
//        person.walk();
//        person.run();



    }

}
