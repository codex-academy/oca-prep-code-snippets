package oca;

public class Methods {


    public static void main(){
        int num1 = 1, num2 = 2;
        int result = sum(num1, num2);
        System.out.println(result);
    }

    public static void main(String[] args){
        int num1 = 1, num2 = 2;
        int result = sum(num1, num2);
        System.out.println(result);
        main();
    }

    public static int sum(int x, int y){
        return(x + y);
    }
}
