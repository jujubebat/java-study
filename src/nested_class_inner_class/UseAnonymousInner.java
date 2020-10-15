package nested_class_inner_class;

interface Printable3{
    void print();
}

class Papers3{
    private String con;
    public Papers3(String s){
        con = s;
    }

    public Printable3 getPrinter(){
        return new Printable3(){ // 익명 클래스의 정의와 인스턴스 생성
            public void print(){
                System.out.println(con);
            }
        };
    }
}

public class UseAnonymousInner {
    public static void main(String[] args) {
        Papers3 p = new Papers3("서류 내용 : 행복 합니다.");
        Printable3 prn = p.getPrinter();
        prn.print();
    }
}
