package oca.interfaces;

interface That {
    int count = 1;
}

public class AboutImplicitFieldsOnInterfaces {

    public static void main(String[] args) {

        // static
        // public

        System.out.println(That.count);

        // That.count = 7;

    }

}
