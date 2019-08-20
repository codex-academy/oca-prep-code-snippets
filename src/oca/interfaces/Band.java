package oca.interfaces;

interface Instrument {
    static void sound() {
        System.out.println("tralala!");
    }

    default void play() {
        sound();
        sound();
        sound();
    }

    void sound(int volume);
}

abstract class BaseInstrument implements Instrument {

    public static void sound() {
        System.out.println("Dohm! Dohm!");
    }

    @Override
    public void play() {

    }

    @Override
    public void sound(int volume) {
        System.out.println("Thum! Thum!");
    }
}

class BaseGuitar extends BaseInstrument {

}

class Trumpet implements Instrument {

    @Override
    public void sound(int volume) {
        for (int i = 0; i < volume; i++) {
            this.play();
        }
    }

//    @Override
//    public void play() {
//        System.out.println("toot! toot!");
//    }
}

public class Band {
    public static void main(String[] args) {

        Instrument.sound();
        Trumpet trumpet = new Trumpet();
        trumpet.play();
        System.out.println("---");
        trumpet.sound(3);

        // This don't work as methods in Interfaces is not
        // accessible in the class that implement them
        // Trumpet.sound();

        // a class that extends a base class can access it's static methods
        BaseGuitar.sound();
    }
}
