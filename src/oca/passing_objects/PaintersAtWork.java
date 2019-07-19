package oca.passing_objects;

public class PaintersAtWork {

    public static void main(String[] args) {

        Painter orangePainter = new Painter("Orange");
        Painter bluePainter = new Painter("Blue");
        Painter lilacPainter = new Painter("Lilac");


        House myOldHouse = new House("Pink");

        System.out.println(myOldHouse);

        House myPaintedHouse = orangePainter.paint(myOldHouse);

        System.out.println(myOldHouse);
        System.out.println(myPaintedHouse);

        double myMoney = 200;
        myMoney = orangePainter.pay(myMoney);

        System.out.println(myMoney);

    }

}
