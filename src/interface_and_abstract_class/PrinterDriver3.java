package interface_and_abstract_class;

interface ColorPrintable extends Printable{ // Printable을 상속하는 인터페이스
    void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable{
    @Override
    public void print(String doc){
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc){
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}


// 두 클래스 상이의 상속은 extends로 명시한다.
// 두 인터페이스 사이의 상속도 extends로 명시한다.
// 인터페이스와 클래스 사이의 구현만 implements로 명시한다.


public class PrinterDriver3 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        ColorPrintable prn = new Prn909Drv();
        prn.print(myDoc); // 흑백 출력

        System.out.println();

        prn.printCMYK(myDoc); // 컬러 출력
    }
}
