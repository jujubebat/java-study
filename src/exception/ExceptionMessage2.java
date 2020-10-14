package exception;

public class ExceptionMessage2 {
    public static void md1(int n){
        md2(n,0); // 아래의 메소드 호출
    }

    public static void md2(int n1, int n2){
        int r = n1 / n2; // 예외 발생 지점
    }

    public static void main(String[] args) {
        try{
            md1(3);
        }catch (ArithmeticException e){
            // 예외 클래스의 최상위 클래스는 Throwable 이다.(물론 위에 Object 클래스가 있다.)
            // 따라서 매개변수 형을 (Throwable e) 라고 해도 된다.
            e.printStackTrace();
        }

        System.out.println("Good bye~~~!");
    }
}
