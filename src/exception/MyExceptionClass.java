package exception;

import java.util.Scanner;

class ReadAgeException extends Exception{
    public ReadAgeException(){
         super("유효하지 않은 나이가 입력되었습니다."); // 상위 클래스의 생성자를 호출한다.
         // 인자로 넘기는 문자열은 Throwable 클래스에 정의된 getMessage 호출시 반환된다.
    }
}

public class MyExceptionClass {

    public static void main(String[] args) {
        System.out.println("나이 입력");

        try{
            int age = readAge();
            System.out.printf("입력된 나이 : %d\n", age);
        }catch (ReadAgeException e){
            System.out.println(e.getMessage());
        }
    }

    public static int readAge() throws ReadAgeException{
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();

        if(age < 0)
            throw new ReadAgeException(); // 이렇게 예외를 직접 발생시킬 수 있다.

        // 위에서 직접 정의한 ReadAgeException은 Exception을 상속하는 예외이므로
        // try ~ catch 문 또는 throws 선언을 통해 넘겨야한다.

        return age;
    }
}
