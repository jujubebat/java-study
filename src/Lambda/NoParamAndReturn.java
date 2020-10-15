package Lambda;

import java.util.Random;

interface Generator{
    int rand(); // 매개변수 없는 메소드
}

public class NoParamAndReturn {
    public static void main(String[] args) {
        Generator gen = () -> {
            Random rand = new Random();
            return rand.nextInt(50);
            // 이렇게 둘 이상의 문장으로 이뤄진 람다식은 중괄호로 반드시 감싸야한다.
            // return 문도 반드시 사용해야 한다!
        };

        System.out.println(gen.rand());
    }
}
