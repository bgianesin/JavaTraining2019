package javatraining.dateTime;

// Java code for LocalDate
// / LocalTime Function
import java.time.*;
import java.time.format.DateTimeFormatter;

public class NewDateAPI {

    // Driver code
    public static void main(String[] args){

        // the current date
        LocalDate date = LocalDate.now();
        System.out.println("The current date is "+date);

        // the current time
        LocalTime time = LocalTime.now();
        System.out.println("The current time is "+time);


        // will give us the current time and date
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time : "+current);


        // to print in a particular format
        DateTimeFormatter format =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = current.format(format);
        System.out.println("In foramatted manner "+formatedDateTime);


        // printing months days and seconds
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int hour = current.getHour();
        int minute=current.getMinute();
        int seconds = current.getSecond();
        System.out.println("Month : "+month+" day : "+day+" hour : "+hour +" minutes : "+minute+" seconds : "+seconds);


        // printing some specified date
        LocalDate date2 = LocalDate.of(1831,7,21);
        System.out.println("Belgian National Day :"+date2);


        // printing date with current time.
        LocalDateTime specificDate =current.withDayOfMonth(20).withYear(2019);
        System.out.println("Specfic date with "+"current time : "+specificDate);
    }

}
