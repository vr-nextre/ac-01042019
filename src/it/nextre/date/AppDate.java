package it.nextre.date;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class AppDate {

    public static void main(String[] args) {

        Date d1 = new Date();

        Calendar cal = new GregorianCalendar();
        cal.setLenient(false);
        cal.set(2019,GregorianCalendar.APRIL,29);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MMMM-dd", Locale.ITALY);
        System.out.println(sdf.format(cal.getTime()));



        LocalDate ld1 = LocalDate.of(2019,4,29);
        System.out.println(ld1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MMMM-dd");
        System.out.println(ld1.format(dtf));


        LocalDateTime ldt = LocalDateTime.of(2019, Month.APRIL,29,0,30);
        System.out.println(ldt);



        //"YYYY-MMMM-dd HH:mm:ss"
        DateTimeFormatter dtfZone = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        DateTimeFormatter dtfZone2 = DateTimeFormatter.ofPattern("YYYY-MMMM-dd HH:mm:ss OOOO XXXXX VV zzzz ");

        ZonedDateTime zdt = ZonedDateTime.of(2019,Month.APRIL.getValue(),29,0,30,0,0, ZoneId.systemDefault());
        ZonedDateTime zdt2 = ZonedDateTime.of(2019,Month.APRIL.getValue(),29,0,30,0,0, ZoneId.of("Australia/Canberra"));
        System.out.println(zdt);
        System.out.println(zdt2);
        System.out.println(zdt.format(dtf));
        System.out.println(zdt2.format(dtf));
        System.out.println("dtf zone");
        System.out.println(zdt.format(dtfZone));
        System.out.println(zdt2.format(dtfZone));
        System.out.println("dtf zone2");
        System.out.println(zdt.format(dtfZone2));
        System.out.println(zdt2.format(dtfZone2));


        LocalDateTime adesso = LocalDateTime.now();
        ZonedDateTime adessoZ = ZonedDateTime.now();

        System.out.println(adesso);
        System.out.println(adessoZ);


        LocalDate domani = LocalDate.now().plus(1, ChronoUnit.DAYS);
        System.out.println(domani);
        LocalDateTime ldtTomorrow = ldt.plusDays(1);
        System.out.println(ldt);
        System.out.println(ldtTomorrow);





    }//end main

}//end class
