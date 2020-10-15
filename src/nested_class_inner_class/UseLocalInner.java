package nested_class_inner_class;

interface Printable2{
    void print();
}

class Papers2 {
    private String con;
    public Papers2(String s) {
        con = s;
    }

    public Printable2 getPrinter(){

        // 로컬 클래스의 정의. 메소드 안에 클래스 Printer2의 정의가 위치한다.
        // 아래와 같이 메소 내에 클래스를 정의하면 해당 메소드 내에서만 인스턴스 생성이 가능하다.
        // 즉, 멤버 클래스보다도 클래스를 더 깊이, 특정 블록 안으로 감추는 효과가 있다.
        class Printer2 implements Printable2{
            public void print(){
                System.out.println(con);
            }
        }

        return new Printer2();
    }
}

public class UseLocalInner {
    public static void main(String[] args) {
        Papers2 p = new Papers2("서류 내용 : 행복 합니다.");
        Printable2 prn = p.getPrinter();
        prn.print();
    }
}
