package interface_and_abstract_class;

interface Printable3{
    // 인터페이스에도 static 메소드를 정의할 수 있다. 인터페이스의 static 메소드 호출 방법은 클래스의 static 메소드 호출 방법과 같다.
    static void printLine(String str){
        System.out.println(str);
    }

    default void print(String doc){
        printLine(doc); // 인터페이스의 static 메소드 호출
    }
}

// 인터페이스 Printable에는 구현해야 할 메소드가 존재하지 않는다.
class Printer2 implements Printable3 { }

public class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "This is a report about";
        Printable3 prn = new Printer2();
        prn.print(myDoc);

        // 인터페이스의 static 메소드 호출
        Printable3.printLine("end of line");
    }
}

// 프로그래머가 직접 인터페이스에 static 메소드를 정의하는 일은 드물다.
// 그러나 자바에서 제공하는 인터페이스에 static 메소드가 정의된 경우가 있다.
