package oca.two_dimensioanl_arrays;

public class TaxiFare {

    public static void main(String[] args) {

        double[][] monthlyTaxiFare = new double[4][7];

        final int WEEK_ONE = 0;

        final int MONDAY = 0;
        final int WEDNESDAY = 2;

//        monthlyTaxiFare[0][0] = 36;
//        monthlyTaxiFare[0][4] = 38.50;
//        monthlyTaxiFare[1][0] = 46;
//        monthlyTaxiFare[1][6] = 72.00;
//        monthlyTaxiFare[2][2] = 56.00;
//        monthlyTaxiFare[3][0] = 23.00;
//        monthlyTaxiFare[3][4] = 43.00;


//        System.out.println(monthlyTaxiFare[0][MONDAY]);
//        System.out.println(monthlyTaxiFare[1][MONDAY]);
//        System.out.println(monthlyTaxiFare[2][MONDAY]);
//        System.out.println(monthlyTaxiFare[3][MONDAY]);


        for(int week = 0; week < monthlyTaxiFare.length; week++ ) {

            for (int day = 0; day < monthlyTaxiFare[week].length; day++){

                monthlyTaxiFare[week][day] = week * day;

            }
        }


        for(int week = 0; week < monthlyTaxiFare.length; week++ ) {
            for (int day = 0; day < monthlyTaxiFare[week].length; day++){

                if (monthlyTaxiFare[week][day] > 0) {
                    System.out.print(monthlyTaxiFare[week][day]);
                } else {
                    System.out.print("***");
                }


                System.out.print(" | ");
            }
            System.out.println();
        }

//        for(int week = 0; week < monthlyTaxiFare.length; week++ ) {
//            for (int day = 0; day < monthlyTaxiFare[week].length; day++){
//
//                if (monthlyTaxiFare[week][day] > 0) {
//                    System.out.print(monthlyTaxiFare[week][day]);
//                } else {
//                    System.out.print("***");
//                }
//
//
//                System.out.print(" | ");
//            }
//            System.out.println();
//        }


    }

}
