package date_and_time;

import java.time.ZoneId;

public class ZoneIdDemo2 {

  public static void main(String[] args) {
    ZoneId.getAvailableZoneIds()
        .stream()
        .filter(s -> s.startsWith("Asia")) // Asia로 필터링
        .sorted()
        .forEach(s -> System.out.println(s));
  }
}
