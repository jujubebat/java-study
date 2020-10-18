package date_and_time;

import java.time.LocalDate;

public class LocalDateDemo1 {

  public static void main(String[] args) {
    // 오늘
    LocalDate today = LocalDate.now();
    System.out.println("Today : " + today); // LocalDate의 toString 메소드는 날짜를 "YYYY-MM-DD" 형태의 문자열로 반환한다.

    // 올해의 크리스마스
    LocalDate xmas = LocalDate.of(today.getYear(), 12 ,25);
    System.out.println("Xmas : " + xmas);

    // 올해의 크리스마스 이브
    LocalDate eve = xmas.minusDays(1); // LocalDate 인스턴스는 immutable 인스턴스다. 수정하면 기존 인스턴스가 수정되는 것이 아니라 인스턴스를 새로 생성해서 반환한다.
    System.out.println("Xmas Eve : " + eve);
  }
}
