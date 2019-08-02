package oca.inheritance;

interface Color {
    void draw();
}

class Blue implements Color {

    @Override
    public void draw() {
        System.out.println("blue");
    }
}

class DarkBlue implements Color {

    @Override
    public void draw() {
        System.out.println("dark blue");
    }
}

interface DrawLine {

}




public class Paint {
    public static void main(String[] args) {

    }
}
