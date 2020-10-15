package Lambda;

interface Printable5{
    void print(String s);
}

public class OneParamNoReturn { // 매개변수가 하나이고 반환하지 않는 람다식
    public static void main(String[] args) {
        Printable5 p;

        p = (String s) -> {
            System.out.println(s); // 줄임 없는 표현
        };
        p.print("Lambda exp one.");

        p = (String s) ->{
            System.out.println(s); // 중괄호 생략
        };
        p.print("Lambda exp two.");

        p = (s) -> System.out.println(s); // 매개변수 형 생략
        p.print("Lambda exp three.");

        p = s -> System.out.println(s); // 매개변수 소괄호 생략
        p.print("Lambda exp four.");
    }
}
