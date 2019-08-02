package oca.nested_loops;

public class Stars {

    public static void drawLine(int dimension) {

    }

    public static void square(int dimension) {

        for (int i = 0; i<dimension;i++){
            for (int j = 0; j < (dimension - i); j++) {
                System.out.println(i + ", " + j);
                // System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        square(4);

        System.out.println();
        System.out.println();

        square(2);

        System.out.println();

        square(4);

        System.out.println();
        System.out.println();

        square(7);

        System.out.println();
        System.out.println();

        square(9);

        square(37);


    }

}
