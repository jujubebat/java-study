package date_and_time;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {

  public static void main(String[] args) {
    // PC방의 PC 이용 시작 시각
    LocalTime start = LocalTime.of(14, 24, 35);
    System.out.println("PC 이용 시작 시각 : " + start);

    // PC방의 PC 이용 종료 시각
    LocalTime end = LocalTime.of(17, 31, 19);
    System.out.println("PC 이용 종료 시각 : " + end);

    // PC 이용 시간 계산
    Duration between = Duration.between(start, end);
    System.out.println("총 PC 이용 시간 : " + between); // ISO-8601의 시각을 나타내는 포멧으로 출력된다.
  }
}
