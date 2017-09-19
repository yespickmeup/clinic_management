/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author i1
 */
public class DateUtils1 {

    public static void main2(String[] args) {
        String d1 = "2015-01-31";
        System.out.println(ar_aging(d1, 30));
    }

    public static void main3(String[] args) {
        try {
            Date from = DateType.sf.parse("2015-01-29");
            Date to = new Date();
            int count_days = DateUtils1.count_days(from, to);
            System.out.println(count_days);
        } catch (ParseException ex) {
            Logger.getLogger(DateUtils1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int ar_aging(String trans_date, int term) {
        int days = 0;
        Date date_from = new Date();
        try {
            date_from = DateType.sf.parse(trans_date);
        } catch (ParseException ex) {
            Logger.getLogger(DateUtils1.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
//        Date due = add_day(date_from, term);
        days = count_days(date_from, new Date());
        return days;

    }

    public static Date add_day(Date date_added, int days) {
        date_added.setDate(date_added.getDate() + days);
        return date_added;
    }

    public static int count_days(Date date_from, Date date_to) {
        int count = 0;
        int d1_year = Integer.parseInt(DateType.y.format(date_from));
        int d1_month = Integer.parseInt(DateType.m1.format(date_from));
        int d1_day = Integer.parseInt(DateType.d.format(date_from));

        int d2_year = Integer.parseInt(DateType.y.format(date_to));
        int d2_month = Integer.parseInt(DateType.m1.format(date_to));
        int d2_day = Integer.parseInt(DateType.d.format(date_to));

        Calendar c1 = Calendar.getInstance();
        c1.set(d1_year, d1_month, d1_day);
        Calendar c2 = Calendar.getInstance();
        c2.set(d2_year, d2_month, d2_day);

        Date d1 = c1.getTime();
        Date d2 = c2.getTime();

        long diff = d2.getTime() - d1.getTime();
        int noofdays = (int) (diff / (1000 * 24 * 60 * 60));
        count = noofdays;
        return count;
    }

    public static void main(String[] args) {
//        System.out.println("Age: "+getAge(1991,2,29));
    }

    public static String getAge(String sf) {
        String ages = "";
        try {
            Date d = DateType.sf.parse(sf);
            int year = Integer.parseInt(DateType.y.format(d));
            int month = Integer.parseInt(DateType.m1.format(d));
            int day = Integer.parseInt(DateType.d.format(d));
           
            Calendar dob = Calendar.getInstance();
            Calendar today = Calendar.getInstance();

            dob.set(year, month, day);
            int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
            if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
                age--;
            }
          
            ages = ""+age;

        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return ages;
    }
}
