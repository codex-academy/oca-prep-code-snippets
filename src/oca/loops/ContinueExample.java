package oca.loops;

public class ContinueExample {
    public static void main(String[] args) {

        String commands[] = {"Go", "Stop", "Go", "Skip", "Go", "Skip", "Stop", "Go", "Skip" , "Go"};
        int skipCount = 0;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            if("Skip".equalsIgnoreCase(command)){
                skipCount++;
                continue;
            }

            if (skipCount == 3){
                break;
            }

            System.out.println(command);

        }



    }
}
