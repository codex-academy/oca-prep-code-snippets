package oca;

public class TypePromotion {
    public static void main(String[] args) {

        byte origin = 7;
        short next = origin;
        int int_next = next;
        long long_next = int_next;

         long_next = origin;

         // int ii = 3703629630;



        double theDouble = 6;
        System.out.println(theDouble);

        System.out.println("-------------------");
        System.out.println("Promote byte to short");
        byte b = 100;

        short newShortFromByte = b;
        System.out.println(newShortFromByte);

        System.out.println("-------------------");
        System.out.println("Promote short to int");


        short s = 32767;

        int newIntFromShort = s;
        System.out.println(newIntFromShort);

        // short newShortFromInt = newIntFromShort;


        System.out.println("-------------------");

        System.out.println(b);
        int i = 2147483647;

        long newLongFromInt = i;
        System.out.println(newLongFromInt);

        long l = Long.MAX_VALUE;
        System.out.println(l);

        System.out.println("******************");

        float f1 = 1200.24F;

        double d1 = f1;

        // float float2 = d1;
        System.out.println("/////////////////////");
        double shortDouble = 3.0;
        System.out.println(shortDouble);

        int shrt = (byte)shortDouble;

        System.out.println(shrt);

        int n1 = 99;
        int n2 = 30;

        byte b1 = (byte)(n1 + n2);
        System.out.println(b1);

        float ii2 = (float)(9000000 + 7 + 4.23);
        System.out.println(ii2);

        byte ii4 = '@';
        System.out.println(ii4);

        // char cc4 = ii4;
        short aa = 1, bb = 2;

        // aa = 1;
        // bb = 2;

        int cc = aa + bb;

        int ageYears = 32;
        // long ageSeconds = ageYears * 365 * 24 * 60 * 60;

        long yy = 99;

        int yyy = 9*7*12;

        double iii = 9.76f;
        System.out.println(iii);

        float ff = (float)23.12;

        int i7 = 771;

        Object obj = i7;

        System.out.println(obj.toString());

        boolean isInt = obj instanceof Integer;
        System.out.println(isInt);







    }
}
