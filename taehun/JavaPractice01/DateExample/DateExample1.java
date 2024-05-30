package JavaPractice01.DateExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample1 {
    public static void main(String[] args) throws ParseException {
        String korea = "yyyy-MM-dd";
        String usa = "MM-dd-yyyy";
        String pattern = "E요일 HH시 mm분 ss초 zzz";
        String pattern2 = "yyyy-MM-dd E요일 HH시 mm분 ss초 zzz";
        String myDate = "20240527";

        Date currentDate = new Date();
        SimpleDateFormat p1 = new SimpleDateFormat(korea);
        System.out.println(p1.format(currentDate));
        SimpleDateFormat p2 = new SimpleDateFormat(usa);
        System.out.println(p2.format(currentDate));
        SimpleDateFormat p3 = new SimpleDateFormat(pattern);
        System.out.println(p3.format(currentDate));
        SimpleDateFormat p4 = new SimpleDateFormat(pattern2);
        System.out.println(p4.format(currentDate));

        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
        Date myDate1 = dtFormat.parse(myDate);
        System.out.println(myDate1);

        Calendar today1 = Calendar.getInstance();
        System.out.println(today1.get(Calendar.YEAR)+"년 " + (today1.get(Calendar.MONTH) + 1) +"월");
        System.out.println(today1.getTimeZone().getDisplayName());
    }
}
