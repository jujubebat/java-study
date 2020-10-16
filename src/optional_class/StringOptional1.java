package optional_class;

import java.util.Optional;

public class StringOptional1 {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of(new String("Toy1"));

        // ofNullable의 인자로는 null을 전달할 수 있다.
        // 즉, 비어있는 Optional 인스턴스를 생성할 수 있다.
        // 반면, of 메소드에는 null을 인자로 전달할 수 없다.
        // null을 전달할 경우 NullPointerException이 발생한다.
        Optional<String> os2 = Optional.ofNullable(new String("Toy2"));

        if(os1.isPresent())
            System.out.println(os1.get());

        if(os2.isPresent())
            System.out.println(os2.get());
    }
}
