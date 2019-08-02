package oca.nested_loops;

public class FindLenny {
    public static void main(String[] args) {
        String name = "Lenny@123";
        String guess = "";
        int attempts = 0;
        while (!guess.equalsIgnoreCase(name)) {
            guess = "";
            while (guess.length() < name.length()) {
                char asciiChar = (char) (Math.random() * 26 + 97);
                guess += asciiChar;
                // System.out.println(guess);
            }
            attempts++;
        }
        System.out.println(name + " found after " + attempts + " tries!");
    }
}
