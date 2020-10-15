package Lambda;

interface Printable4{
    void print(String s);
}

public class Lambda4 {
    public static void ShowString(Printable4 p, String s){
        p.print(s);
    }

    public static void main(String[] args) {
        ShowString((s) -> {
            System.out.println();
        }, "What is Lambda?"); // 람다식과 문자열을 매개변수로 넘기고 있다.
    }
}


