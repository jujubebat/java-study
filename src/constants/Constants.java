package constants;

public class Constants {

  public static void main(String[] args) {
    final int MAX_SIZE = 100;
    final char CONST_CHAR = '상';
    final int CONST_ASSIGEND;
    CONST_ASSIGEND = 12; // 할당하지 않았던 상수의 값 할당. 상수를 선언만하고 값을 할당하지 않으면 한 번은 값을 할당할 수 있다.

    System.out.println("상수 1 : " + MAX_SIZE);
    System.out.println("상수 2 : " + CONST_CHAR);
    System.out.println("상수 3 : " + CONST_ASSIGEND);
  }
}


/*
상수는 '값이 변하지 않는 수'를 의미한다.
자바에서는 한 번 그 값이 정해지면 이후로는 변경이 불가능한 변수도 상수라고 한다.
변수를 선언할 떄 그 앞에 final이라는 선언을 추가하면 그 변수는 상수가 된다.

상수는 값을 딱 한 번만 할당할 수 있고, 한 번 할당된 값은 변경이 불가능하다.
상수의 이름은 관례상 모두 대문자로 짓고, 이름이 둘 이상의 단어로 이뤄질 경우 단어 사이에 언더바를 넣는다.

 */