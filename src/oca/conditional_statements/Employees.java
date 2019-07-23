package oca.conditional_statements;

public class Employees {

    public String name1 = new String("Fred Smith");
    public String name2 = new String("Fred Smith");

    public void areNamesEqual() {

        if (name1 == name2) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }
    }

    public static void main(String[] args) {
        Employees em = new Employees();

        em.areNamesEqual();
    }
}

