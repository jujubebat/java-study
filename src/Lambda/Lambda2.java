package Lambda;

interface Printable2{
    void print(String s);
}

public class Lambda2 {
    public static void main(String[] args) {
        Printable2 prn = new Printable2() { // 익명 클래스 사용! Lambda1 예제와 비교하면, Printer 클래스 정의를 하지 않아도 된다.
            public void print(String s) {
                System.out.println(s);
            }
        };

        prn.print("What is Lambda?");
    }
}
