package Lambda;

interface HowLong{
    int len(String s); // 값을 반환하는 메소드
}

public class OneParamAndReturn {
    public static void main(String[] args) {
        HowLong h1 = s -> s.length(); // return문을 따로 명시하지 않아도 된다!
        System.out.println(h1.len("I am so happy"));
    }
}
