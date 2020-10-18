package date_and_time;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {

  public static void main(String[] args) {
    Instant start = Instant.now(); // 현재 시각 정보를 담음
    System.out.println("시작 : " + start.getEpochSecond());

    System.out.println("Time files like an arrow.");

    Instant end = Instant.now(); // 현재 시각 정보를 담음
    System.out.println("끝 : " + end.getEpochSecond());

    Duration between = Duration.between(start, end); // 두 시각의 차 계산
    System.out.println("밀리 초 단위 차 : " + between.toMillis());
  }
}

// getEpochSecond가 반환하는 값은
// '1970-01-01 00:00:00'을 기준으로(이 기준을 '표준 자바 epoch'라 한다.) 지나온 시간을 초 단위로 계산한 결과이다.