package date_and_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

  public static void main(String[] args) {
    ZonedDateTime date = ZonedDateTime.of(
        LocalDateTime.of(2019, 4, 25, 11, 20), ZoneId.of("Asia/Seoul"));

    DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-m-d");
    DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-mm-d, h:m:s");
    DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yyyy-mm-d, hh:mm:ss VV");

    System.out.println(date.format(fm1));
    System.out.println(date.format(fm2));
    System.out.println(date.format(fm3));
  }
}
