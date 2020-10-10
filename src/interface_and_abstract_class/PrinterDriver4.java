package interface_and_abstract_class;

import javax.swing.*;

interface Printable2{
    void print(String doc);
    default void printCMYK(String doc){ } // 인터페이스의 디폴드 메소드

    // 디폴트 메소드는 그 자체로 완전한 메소드다.
    // 따라서 이를 구현하는 클래스가 오버라이딩 하지 안항도 된다.
    // 처음에는 Printable2 인터페이스에 print 추상 메소드만 있었는데,
    // 이후 필요에 따라 printCMYK 메소드를 추가한 것이다.
    // 디폴트 메소드로 추가하였으니, 이전에 구현된 드라이버(Prn731Drv2)에게는 영향을 주지 않는다.
}

class Prn731Drv2 implements Printable2{
    @Override
    public void print(String doc){
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

class Prn909Drv2 implements Printable2{
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

public class PrinterDriver4 {
    public static void main(String[] args) {
        String myDoc = "This is a report about....";

        Printable2 prn1 = new Prn731Drv2();
        prn1.print(myDoc);

        System.out.println();

        Printable2 prn2 = new Prn909Drv2();
        prn2.print(myDoc);
    }
}
