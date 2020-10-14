package exception;

import java.util.Scanner;

public class ExceptionCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("a/b...a? ");

        int n1 = kb.nextInt(); // int형 정수 입력
        System.out.println("a/b...b? ");

        int n2 = kb.nextInt(); // int형 정수 입력
        System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
        System.out.println("Good bye~~~!");
    }
}

// 가상 머신은 예외가 발생하면 그 내용을 간단히 출력하고 프로그램을 종료해버린다.
// 자바는 예외 상황별로 그 상황을 알리기 위한 클래스를 정희하고 있다. 이러한 클래스를 예외 클래스라 한다.
// 예를들어 java.lang.ArithmeticException은 수학 연산에서의 오류 상황을 의미하는 클래스다.
// 위 예제에서 보인 바와 같이 수학 연산 관련 오류가 발생하면 가상머신은 예외 클래스 ArithmeticException의 인스턴스를 생성한다.
// 그리고 이 인스턴스를 프로그래머가 처리하면 예외는 처리된 것으로 간주하여 프로그램을 종료하지 않는다.
// 그러나 이 인스턴스를 처리하지 않으면 프로그램은 그냥 종료된다.