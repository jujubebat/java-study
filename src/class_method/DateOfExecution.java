package class_method;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateOfExecution {

    static String date;

    // 오늘의 날짜 정보를 String 변수에 저장하고 싶으면 아래와 같이 2줄이 필요하다.
    // 이러한 경우 'static 초기화 블록'을 사용한다.
    // 'static 초기화 블록'은 클래스 변수와 마찬가지로 가상머신이 클래스의 정보를 읽어들일 때 실행된다.

    static {
        LocalDate nDate = LocalDate.now();
        date = nDate.toString();
    }

    public static void main(String[] args) {
        System.out.println(date);
    }
}
