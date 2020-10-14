package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        try{
            System.out.println("a/b...a? ");
            int n1 = kb.nextInt(); // int형 정수 입력 ex) 2 // InputMismatchException 예외 발생가능
            System.out.println("a/b...b? ");
            int n2 = kb.nextInt(); // int형 정수 입력 ex) 0 // InputMismatchException 예외 발생가능
            System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2); // ArithmeticException 예외 발생가능
        }catch (ArithmeticException | InputMismatchException e){ // 이렇게 두 종류의 예외를 처리할 수 있다.
            System.out.println(e.getMessage());
        }

        System.out.println("Good bye~~~!");
    }
}

/*
* 가상머신은 2를 0으로 나누는 예외가 발생하면 ArithmeticException 인스턴스를 생성한다.
* 그리고 예외 발생 지점을 감싸는 try 영역에 이어서 등장하는
* catch 영역에서 이 인스턴스를 인자로 받을 수 있는지 확인하고
* 받을 수 있으면 catch 영역으로 인스턴스를 전달한다. (메소드 호출시의 인자 전달 과정과 동일하다.)
* 이렇듯 catch 영역으로 예외 인스턴스가 전달이 되면, 가상머신은 예외가 처리된 것으로 판단한다.
* 따라서 catch 영역이 실행된 이후에 try-catch 문의 다음 문장을 이어서 실행해 나간다.
* "Good bye~~!"의 출력을 확인할 수 있다.
* */