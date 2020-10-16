package optional_class;

import java.util.Optional;

public class OptionalMap {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("Optional String");
        Optional<String> os2 = os1.map(s -> s.toUpperCase());
        System.out.println(os2.get());

        Optional<String> os3 = os1.map(s -> s.replace(' ', '_'))
                .map(s -> s.toLowerCase());

        System.out.println(os3.get());
        // Optional 클래스에는 Optional 인스턴스에 저장된 내용물을 반환하는 get 메서드가 존재한다.
    }
}

// map 메서드는 apply 메소드가 반환하는 대상을 Optional 인스턴스에 담아서 반환한다.
