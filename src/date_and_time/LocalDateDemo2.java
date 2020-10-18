package date_and_time;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2 {

  public static void main(String[] args) {
    // 오늘
    LocalDate today = LocalDate.now();
    System.out.println("Today : " + today);

    // 올 해의 크리스마스
    LocalDate xmas = LocalDate.of(today.getYear(), 12 , 25);
    System.out.println("Xmas : " + xmas);

    // 크리스마스까지 앞으로 며칠?
    Period left = Period.between(today, xmas); // today와 xmas 두 날짜의 차를 담은 Period 인스턴스를 생성할 수 있다.
    System.out.println("Xmas까지 앞으로 " + left.getMonths() + "월" + left.getDays() + "일");
  }

}
