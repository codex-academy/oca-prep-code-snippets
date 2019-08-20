package oca.interfaces;

 interface TheBase {
//     static int counter;
//     static int theCounter() {
//         counter++;
//        return counter;
//    }
}


class MyBase implements TheBase {

}


public class UsingAnInterface implements AnInterface {

    @Override
    public void myMethod1() {
        System.out.println("My myMethod1");
    }

    public static void main(String[] args) {

//        TheBase.theCounter(); // works!!
//        System.out.println(TheBase.theCounter());
//
//        // MyBase.theCounter(); //
//        MyBase base = new MyBase();

        // System.out.println(base.theCounter());;

    }

}
