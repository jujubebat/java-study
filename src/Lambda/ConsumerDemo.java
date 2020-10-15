package Lambda;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        // Consumer는 인자는 전달받지만 반환은 하지 않는 함수형 인터페이스다.
        // 전달된 인자 기반으로 '반환' 이외의 다른 결과를 보일 때 유용하게 사용할 수 있다.

        c.accept("Pineapple"); // 출력이라는 결과를 보임
        c.accept("Strawberry");
    }
}
