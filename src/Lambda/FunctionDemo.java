package Lambda;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s->s.length(); // Function<T,R> 인터페이스에는 다음 추상 메서드가 존재한다. R apply(T t);
        System.out.println(f1.apply("Robot"));
        System.out.println(f1.apply("System"));

        ToIntFunction<String> f2 = s -> s.length();
        System.out.println(f2.applyAsInt("Robot"));
        System.out.println(f2.applyAsInt("System"));
    }
}
