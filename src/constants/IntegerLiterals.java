package constants;

public class IntegerLiterals {

  public static void main(String[] args) {
    int num1 = 123; // 10진수 표현
    int num2 = 0123; // 8진수 표현
    int num3 = 0x123; // 16진수 표현

    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);
    System.out.println("num3 : " + num3);

    System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
    System.out.println("011 + 022 + 033 = "+ (011+ 022 + 033));
    System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
  }
}

// 자바에서 정수는 int 형으로 표현되기로 약속되어있다.
// int num = 157; // 숫자 157은 리터럴 상수이다.(그냥 상수라고 불린다.)