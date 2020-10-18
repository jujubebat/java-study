package date_and_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2 {

  public static void main(String[] args) {
    // 현재 시각
    LocalDateTime today = LocalDateTime.of(2030, 4, 25, 11, 20);

    // 항공편1의 출발 시간
    LocalDateTime flight1 = LocalDateTime.of(2030, 5, 14, 11, 15);

    // 항공편2의 출발 시간
    LocalDateTime flight2 = LocalDateTime.of(2030,5,13,15,30);

    // 빠른 항공편을 선택하는 과정
    LocalDateTime myFlight;

    if(flight1.isBefore(flight2)) // flight1이 flight2보다 이전인가? (이후를 묻는 isAfter 메서드도 있다.)
      myFlight = flight1;
    else
      myFlight = flight2;

    // 빠른 항공편의 비행 탑승까지 남은 날짜 계산
    Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate()); // 날짜의 차를 구한다.
    // LocalDateTime의 toLocalDate 메서드 : 날짜에 대한 정보를 LocalDate 인스턴스에 담아서 반환

    // 빠른 항공편의 비행 탐승까지 남은 시간 계산
    Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime()); // 시각의 차를 구한다.
    // LocalDateTime의 toLocalTime 메서드 : 시각에 대한 정보를 LocalTime 인스턴스에 담아서 반환

    // 비행 탑승까지 남은 날짜와 시간 출력
    System.out.println(day);
    System.out.println(time);
  }
}
