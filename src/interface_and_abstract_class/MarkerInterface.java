package interface_and_abstract_class;

import java.lang.annotation.Retention;

interface Upper { } // 마커 인터페이스
interface Lower { } // 마커 인터페이스

interface Printable5{
    String getContents();
}

class Report implements Printable5, Upper{
    String cons;

    Report(String cons){
        this.cons = cons;
    }

    public String getContents(){
        return cons;
    }
}

class Printer5{
    public void printContents(Printable5 doc){
        if(doc instanceof Upper){ // doc 참조 인스턴스가 Upper를 구현한다면
            System.out.println((doc.getContents()).toLowerCase());
        }else if(doc instanceof Lower){ // doc 참조 인스턴스가 Lower를 구현한다면
            System.out.println((doc.getContents()).toUpperCase());
        }else
            System.out.println(doc.getContents());
    }
}

public class MarkerInterface {
    public static void main(String[] args) {
        Printer5 prn = new Printer5();
        Report doc = new Report("Simple Funny News~");
        prn.printContents(doc);
    }
}
