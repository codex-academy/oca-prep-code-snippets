package oca.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

class Person {
    private String username;

    public Person(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return username;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return username.equals(person.username);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(username);
//    }
}

public class NamesArrayList {




    public static void main(String[] args) {


        var andrew = new Person("Andrew");
        var andy = new Person("Andy");
        var drew = new Person("Drew");

        ArrayList<Person> people = new ArrayList<>();
        people.add(andrew);
        people.add(andy);
        people.add(drew);

        // the remove method should be a reference of an object already in the list
        people.remove(new Person("Drew"));
        System.out.println(people);

        // this is a reference to an object in the list
        people.remove(drew);
        System.out.println(people);

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

        names.removeAll(Arrays.asList("Lindani", "Pumla"));

        Predicate<String> removeLongerThan = n -> n.length() > 4;

        names.removeIf(removeLongerThan);
        System.out.println(names);

    }
}
