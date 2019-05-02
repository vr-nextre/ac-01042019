package it.nextre.date;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalQuery;
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


        System.out.println("\n\n\n--------------------------------------------\n\n");

        System.out.println("Errata");
        LocalDateTime partenzaErr = LocalDateTime.of(2019,Month.MAY.getValue(),16,12,30,0,0);
        LocalDateTime arrivoErr = LocalDateTime.of(2019,Month.MAY.getValue(),17,5,50,0,0);

        Duration voloErrato = Duration.between(partenzaErr, arrivoErr);
        System.out.println("Durata errata: " + voloErrato);

        System.out.println("\n\nCorretta");



        ZonedDateTime partenza = ZonedDateTime.of(2019,Month.MAY.getValue(),16,12,30,0,0,ZoneId.of("Europe/Rome"));
        ZonedDateTime arrivo = ZonedDateTime.of(2019,Month.MAY.getValue(),17,5,50,0,0,ZoneId.of("Asia/Shanghai"));


        Duration volo = Duration.between(partenza,arrivo);
        //System.out.println(volo);  //sono 11H di volo
        //tolto 2 ore alla partanza, tolto 8 ore all'arrivo = faccio diffrenza su UTC e mi da 11h e 20 m
        // Italia +2 GMT , SHANGHAI +8 GMT
        // 12:30 - 02:00 = 10:30 (a Greenwich)
        // 10:30 + 11:20 = 21:50
        // 21:50 + 08:00 = 05:50 (a Shanghai)
        // si atterra dopo 11h ma la è come se fosserò passate 17h
        // 21:50 - 10:30 => 11:20



        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter dtfZonedDay = DateTimeFormatter.ofPattern("'DATA:' EEEE YYYY-MM-dd 'ORA:' HH:mm:ss [OOOO VV zz]");
        System.out.println("Partenza di " + partenza.format(dtfZonedDay));
        System.out.println("Arrivo di " + arrivo.format(dtfZonedDay));
        System.out.println("Durata volo: " + volo);


        System.out.println(ldt.format(dtfZonedDay));




        Instant now = Instant.EPOCH;
        System.out.println(now);

        Duration dur = Duration.of(365, ChronoUnit.MINUTES);
        System.out.println(dur.toHours()+"h e "+(365-(dur.toHours()*60))+"m"); //solo la parte intera


    }//end main

}//end class
