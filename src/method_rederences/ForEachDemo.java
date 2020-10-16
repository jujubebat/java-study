package method_rederences;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Box", "Robot");
        ls.forEach(s-> System.out.println(s)); // 람다식 기반
        System.out.println();
        ls.forEach(System.out::println); // 메소드 참조 기반
    }
}
