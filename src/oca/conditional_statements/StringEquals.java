package oca.conditional_statements;

class Animal {
    public Animal(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return type;
    }
}

public class StringEquals {




    public static void main(String[] args) {

        Animal petOne = new Animal("Dog");
        Animal petTwo = new Animal("Dog");

        StringBuilder one = new StringBuilder();
        one.append("Dog");

        System.out.println(petOne.getType());
        System.out.println(one.toString());

        if (petOne.getType().equals(one.toString())) {
            System.out.println("Woof woof!");
        }

    }
}
