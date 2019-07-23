package oca.localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class IsBefore {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please give me 2 dates!");
            return;
        }

        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dateOne = LocalDate.parse(args[0], dateTimeFormatter);
        LocalDate dateTwo = LocalDate.parse(args[1], dateTimeFormatter);

        String status = dateOne.isBefore(dateTwo) ? ":-)" : ":-(";

        System.out.println(status);

    }


}
