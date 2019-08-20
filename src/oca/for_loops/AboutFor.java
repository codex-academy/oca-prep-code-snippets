package oca.for_loops;

public class AboutFor {
    public static void main(String[] args) {

//        int i = 10000;
//        for(;i>=0;) {
//            System.out.println("...");
//            i--;
////            if (i == 0) {
////                break;
////            }
//        }

//        System.out.println("done!");

        for (int i=10;i>=0;i--) {
            System.out.println(i);
        }

        System.out.println("----");
        int y = 10;
        while(true) {
            if (y-- >= 0) {
                System.out.println(y);
            } else break;
//            y--;
        }


    }
}
