package date_and_time;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo1 {

  public static void main(String[] args) {
    // 이곳의 현재 날짜와 시각
    ZonedDateTime here = ZonedDateTime.now(); // 현재 시스템의 날짜, 시각, 시간대 정보를 갖는 인스턴스가 생성되어 반환된다.
    System.out.println(here);

    // 동일한 날짜와 시각의 파리
    ZonedDateTime paris = ZonedDateTime.of(here.toLocalDateTime(), ZoneId.of("Europe/Paris")); // 날짜는 동일하게. 단, 시간대는 파리로 바꾼다.
    System.out.println(paris);

    // 이곳과 파리의 시차
    Duration diff = Duration.between(here, paris);
    System.out.println(diff);
  }
}
