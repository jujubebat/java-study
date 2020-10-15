package Lambda;

interface Printable3{ // 추상 메소드가 하나인 인터페이스
    void print(String s);
}

public class Lambda3 {
    public static void main(String[] args) { // Lambda2 예제를 람다를 기반으로 수정했다. 람다와 익명 클래스의 내부적인 동작 원리는 다르다.
        Printable3 prn = (s) -> {
            System.out.println(s);
        };

        prn.print("What is Lambda?");
    }

}
