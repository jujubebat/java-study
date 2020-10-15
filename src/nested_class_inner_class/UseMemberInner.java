package nested_class_inner_class;

interface Printable{
    void print();
}

class Papers{
    private String con;
    public Papers(String s){
        con = s;
    }
    public Printable getPrinter(){
        return new Printer(); // 멤버 클래스 인스턴스 생성 및 반환
    }

    // 아래 클래스는 클래스 정의가 감춰져 있다.
    private class Printer implements Printable{ // 멤버 클래스의 정의
        public void print(){
            System.out.println(con);
        }
    }
}

public class UseMemberInner {
    public static void main(String[] args) {
        Papers p = new Papers("서류 내용 : 행복합니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}
