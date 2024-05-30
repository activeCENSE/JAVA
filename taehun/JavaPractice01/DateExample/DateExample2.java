package JavaPractice01.DateExample;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class DateExample2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime present = LocalTime.now();

        System.out.println(today + " " + present);
        System.out.println(today.get(ChronoField.MONTH_OF_YEAR) + "월");
        System.out.println(today.getYear() + "년 " + today.getMonthValue() + "월 입니다.");
        LocalDate otherDay = today.withYear(2952);
        System.out.println("이꾸오이는 년도로 " + otherDay.getYear() + "년 입니다.");
        System.out.println(present.getHour() + "시");
        System.out.println(present.get(ChronoField.HOUR_OF_DAY) + "시");
        System.out.println((present.getHour() + 2) + "시");
        System.out.println(today.compareTo(otherDay)); // 2024-2952 = -928 - 만약 년도가 같으면 ? 월로 비교 - 월도 같으면 일로 비교
        System.out.println(today.isEqual(otherDay));
        System.out.println(today.isBefore(otherDay)); //오늘날짜가 비교하는 날짜보다 더 이전날짜인가? - true
        System.out.println(today.isAfter(otherDay)); //false

    }
}
