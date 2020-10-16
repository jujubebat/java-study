package optional_class;

import java.util.Optional;


public class MapElseOptional {
    public static void main(String[] args) {
        Optional<ContInfo> ci = Optional.of(new ContInfo(null, "Republic of Korea"));

        String phone = ci.map(c -> c.getPhone()) // 헷갈리면 map을 뜯어보자.
                .orElse("There is no phone number.");

        String addr = ci.map(c -> c.getAdrs())
                .orElse("There is no address.");

        System.out.println(phone);
        System.out.println(addr);
    }
}

// IfElseOptional.java를 위와 같이 개선했다.
// is, else 문이 없어진 것을 볼 수 있다.