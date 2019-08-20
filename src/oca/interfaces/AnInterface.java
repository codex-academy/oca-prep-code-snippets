package oca.interfaces;

public interface AnInterface {

    // before Java 8 this was not possible?
    abstract void myMethod1();

    default void myMethod2(){
        System.out.println("This is the default... myMethod2");
    }

    static void myMethod3(){
        System.out.println("myMethod3...");
    }


}
