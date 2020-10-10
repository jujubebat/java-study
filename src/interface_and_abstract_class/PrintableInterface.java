package interface_and_abstract_class;

interface Printable{

    int PAPER_WIDTH = 70; // 인터페이스 내부 변수는 반드시 선언과 동시에 값으로 초기화를 해야한다.
    int PAPER_HEIGHT = 120; // 모든 변수는 public, static, final이 선언된 것으로 간주한다.
    // 결론적으로 인터페이스 내 선언된 변수는 상수(final)다.
    // 상수 변수는 대문자로 이름짓는 관례가 있다.

    public void print(String doc); // 이렇게 인퍼페이스에 있는 메소드의 몸체가 비어있는 메소드를 가리켜 추상 메소드라고 한다.

    // 인터페이스의 모든 메소드는 public이 선언된 것으로 간주한다. 따라서 public 선언이 없어도 된다.
}

class Printer implements Printable{ // Printable을 구현하는 Printer 클래스

    // 클래스가 인터페이스를 상속하는 행위는 상속이 아니라 구현이라한다. 문법 관계는 상속이지만 본질은 구현이기 때문이다.
    // 구현할 인터페이스를 명시할 떄 키워드 implements를 사용한다.
    // 한 클래스는 둘 이상의 인터페이스를 동시에 구현할 수 있다.
    // 상속과 구현은 동시에 가능하다.
    // 인터페이스간 상속도 가능하다.
    // 인터페이스를 구현하는 모든 클래스는 인터페이스에 존재하는 모든 '추상'메소드를 구현해야 한다.

    @Override
    public void print(String doc){ // 오버라이딩 관계 성립
        System.out.println(doc);
    }

}

public class PrintableInterface {
    public static void main(String[] args) {
        Printable prn = new Printer(); // Printable 인터페이스형 참조 변수를 선언할 수 있다.
        // Printable 인터페이스형 참조 변수로 Printable 인터페이스를 직접 혹은 간접적으로 구현하는 모든 클래스의 인스턴스를 참조할 수 있다.

        prn.print("Hello Java"); // Printable 인터페이스에 정의된 추상 메소드를 호출할 수 있다. 메소드 오버라이딩이 적용되었다.
    }
}

// 인터페이스의 사전적 의미는 연결점 또는 접점으로 두 사이를 연결하는 매개체를 뜻한다.
// 실제로 자바의 인터페이스는 그런 역할을 한다.

