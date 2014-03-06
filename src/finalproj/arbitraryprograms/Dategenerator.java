package finalproj.arbitraryprograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Dategenerator {

    private static Logger logger = Logger.getLogger(Dategenerator.class.getName());

    public static String getCurrentDate() {
        logger.info("Method call : getCurrentDate");
        Date date = new Date();
        String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return (sdf.format(date));

    }

    public static String getCurrentDatesimple() {
        logger.info("Method call : getCurrentDatesimple");
        Date date = new Date();
        String DATE_FORMAT = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return (sdf.format(date));

    }

    public static String getCurrentDatepath() {
        logger.info("Method call : getCurrentDatepath");
        Date date = new Date();
        String DATE_FORMAT = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return (sdf.format(date));

    }

    /*NOTE: Used for getting DOB*/
    public static Date returndateformat(String s) {
        logger.info("Method call : returndateformat");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newdate = null;
        try {
            newdate = sdf.parse(s);
            return newdate;
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error at returndateformat function Dategenerator" + ex.getMessage());
        }
        return newdate;
    }

    public static int returnYears(String dateofbirth) {
        logger.info("Method call : returnyears");
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime birthdateDate = formatter.parseDateTime(dateofbirth);
        DateMidnight birthdate = new DateMidnight(birthdateDate.getYear(), birthdateDate.getMonthOfYear(), birthdateDate.getDayOfMonth());
        DateTime now = new DateTime();
        Years age = Years.yearsBetween(birthdate, now);
        String ageStr = String.valueOf(age.getYears());

        return Integer.parseInt(ageStr);

    }

    /*Note: Used for calculating whether session is greater than 2 minutes or not (including seconds)*/
    public static int returnminutessqlformat(String startdate, String enddate) {
        logger.info("Method call : returntime");
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S");
        DateTime oldDate = formatter.parseDateTime(startdate);
        DateTime newDate = formatter.parseDateTime(enddate);

        Interval interval = new Interval(oldDate, newDate);
        int difference = interval.toDuration().toPeriod().getHours() * 60 + interval.toDuration().toPeriod().getMinutes();

        return difference;
    }

    /*Note: Used for calculating whether session is greater than 2 minutes or not (not including seconds)*/
    public static int returnminutes(String startdate, String enddate) {
        logger.info("Method call : returnminutes");
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTime oldDate = formatter.parseDateTime(startdate);
        DateTime newDate = formatter.parseDateTime(enddate);

        Interval interval = new Interval(oldDate, newDate);
        int difference = interval.toDuration().toPeriod().getHours() * 60 + interval.toDuration().toPeriod().getMinutes();

        return difference;

    }
}
