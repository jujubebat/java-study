package method_rederences;

import java.util.function.Function;

public class StringMaker {
    public static void main(String[] args) {
        // Function<T, R> 인터페이스의 추상 메서드 : R apply(T, t)

        /*
        Function<char[], String> f = ar -> {
            return new String(ar);
        };
        */

        // Function<char[], String> f = ar -> new String(ar);

        // 람다식을 이루는 문장이 "단순히 인스턴스의 생성 및 참조 값의 반환"일 경우
        // ClassName::new 형태의 메소드 참조로 바꿀 수 있다.
        Function<char[], String> f = String::new; // 생성자 참조 방식

        char[] src = {'R', 'o', 'b', 'o', 't'};
        String str = f.apply(src);
        System.out.println(str);
    }
}

