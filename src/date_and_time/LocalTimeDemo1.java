package date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeDemo1 {

  public static void main(String[] args) {
    // 현재 시각
    LocalTime now = LocalTime.now();
    System.out.println("지금 시각 : " + now); // LocalTime의 toString 메소드는 시각 정보를 시:분:초 형태의 문자열로 반환한다.

    // 2시간 10분 뒤 화상 미팅 예정
    LocalTime mt = now.plusHours(2);
    mt = mt.plusMinutes(10); // LocalTime 인스턴스는 변경 불가능한 immutable 인스턴스이다.

    // 화상 미팅 시각
    System.out.println("화상 미팅 시각 : " + mt);
  }
}
