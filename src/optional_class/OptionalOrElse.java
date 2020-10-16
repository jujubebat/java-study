package optional_class;

import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {
        // Optional 클래스에는 Optional 인스턴스에 저장된 내용물을 반환하는 get 메서드가 존재한다.

        Optional<String> os1 = Optional.empty(); // 빈 Optional 인스턴스 생성
        Optional<String> os2 = Optional.of("So Basic");

        String s1 = os1.map(s -> s.toString()) //map 메서드는 빈 Optional 인스턴스를 반환한다.
                .orElse("Empty");
        // map이 반환한 빈 Optional 인스턴스를 대상으로 orElse를 호출한다면, 문자열 Empty를 참조하게 된다.

        String s2 = os2.map(s -> s.toString())
                .orElse("Empty");

        System.out.println(s1);
        System.out.println(s2);
    }
}

// orElse 메서드는 Optional 인스턴스에 저장된 내용물을 반환한다.
// 단 저장된 내용물이 없을때, 대신해서 반환할 대상을 지정할 수 있다는 점에서 get 메소드와 차이가 있다.
