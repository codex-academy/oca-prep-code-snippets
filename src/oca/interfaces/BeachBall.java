package oca.interfaces;


interface Bouncable {
    void bounce();
    void setBounceFactor(int y);
}

abstract class Ball implements Bouncable {

    void beSpherical() {

    }

    public void bounce() {

    }

    public void bounce(int y) {
    }

}

public class BeachBall extends Ball {

    @Override
    public void bounce() {
        System.out.println("bounce, bounce");
    }

    @Override
    public void setBounceFactor(int y) {
        this.beSpherical();
    }
}
