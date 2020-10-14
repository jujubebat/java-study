package exception;

public class ExceptionMessage {
    public static void md1(int n){
        md2(n,0); // 아래의 메소드 호출
    }

    public static void md2(int n1, int n2){
        int r = n1 / n2; // 예외 발생 지점
    }

    public static void main(String[] args) {
        md1(3);
        System.out.println("Good bye~~~!");
    }
}

// md2에서 예외가 발생한다.
// md2에서 처리 못하면 예외는 md1으로 넘어간다.
// md2에서도 처리 못하면 예외는 main으로 넘어간다.

