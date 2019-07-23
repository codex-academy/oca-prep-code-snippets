package oca.localdatetime;

// import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;

public class UseLocalDateTime {
    public static void main(String[] args) {

//        LocalDateTime currentTime7 = new LocalDateTime();

         LocalDateTime currentTime = LocalDateTime.now();

//         new LocalTime();
//         new LocalDateTime();
//         new LocalDate();

            LocalDate.now();
            LocalTime lt = LocalTime.now();
            LocalDateTime.now();

            // parse the string to a LocalDate
            LocalDate localDateFromString = LocalDate.parse("19-07-1999", DateTimeFormatter.ofPattern("dd-MM-yyyy") );

            // Create the new formatter we want
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

            // Use the formatter on the Date to get what we want
            System.out.println(formatter.format(localDateFromString));

            JapaneseDate jDate = JapaneseDate.from(localDateFromString);

            System.out.println(jDate.getEra().toString());
//            System.out.println(jDate.getEra().toString());

            System.out.println("***************");

             DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy hh-mm-ss");

            System.out.println("Current date: ");
            System.out.println(currentTime);

            System.out.println(String.format("%s hour %s minutes", currentTime.getHour(), currentTime.getMinute()));


            System.out.println("Formatted date: ");
            System.out.println(timeFormatter.format(currentTime.plusDays(90)));

            System.out.println("##############");

            LocalDate today = LocalDate.now();
            System.out.println(today.plusDays(17).getDayOfWeek());

//         java.time.LocalDate currentDate = java.time.LocalDate.now();
//        System.out.println(currentDate);

    }
}
