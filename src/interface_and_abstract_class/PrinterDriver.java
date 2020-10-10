package interface_and_abstract_class;

// Printable : 마이크로 소프트가 정의하고 제공한 인터페이스

class SPrinterDriver implements Printable { // S사 정의한 클래스
    @Override
    public void print(String doc){
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}

class LPrinterDriver implements Printable { // L사 정의한 클래스
    @Override
    public void print(String doc){
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}

public class PrinterDriver {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);

        System.out.println();

        // LG 프린터로 출력
        prn = new LPrinterDriver();
        prn.print(myDoc);
    }
}

// 하나 이상의 추상 메소드를 갖는 클래스를 가리켜 추상 클래스라 한다.
// 추상 클래스는 클래스의 선언부에 abstract 선언을 추가해야한다.
// 추상클래스는 여느 클래스들과 마찬가지로 인스턴스 변수와 인스턴스 메소드를 갖지만
// 이를 상속하는 하위 클래스에 의해서 구현되어야할 메소드가 하나 이상 있는 경우를 추상 클래스라한다.
