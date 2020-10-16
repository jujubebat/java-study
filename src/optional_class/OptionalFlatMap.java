package optional_class;

import java.util.Optional;

public class OptionalFlatMap {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("Optional String");
        Optional<String> os2 = os1.map(s -> s.toUpperCase());
        System.out.println(os2.get());

        // map은 람다식이 반환하는 내용물을 Optional 인스턴스로 감싸는 일을 알아서 해주지만
        // flatMap은 알아서 해주지 않기 때문에 이 과정을 람다식이 포함하고 있어야 한다.
        Optional<String> os3 = os1.flatMap(s -> Optional.of(s.toLowerCase()));
        System.out.println(os3.get());
    }
}
