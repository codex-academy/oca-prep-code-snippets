package oca.static_methods;

public class Frog {

    private static int counter = 0;

    static {
        counter = 7;
        System.out.println("In static block!");
    }

    static {
        System.out.println("another static block!");
    }

    static int getCount() {
        return counter;
    }

    {
        System.out.println("in first block");
    }

    {
        System.out.println("in second block");
        this.croaks();
    }

    public Frog() {
        counter++;
        System.out.println("In constructor!");
    }

    void croaks() {
        System.out.println("Kwaak!");
    }

    public static void main(String[] args) {

        new Frog();
        new Frog();
        new Frog();
        new Frog();
        new Frog();
        new Frog();
        Frog frog = new Frog();

        Frog.getCount();

        System.out.println(frog.getCount());;


    }
}
