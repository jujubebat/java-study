package stream_2;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapStream {

  public static void main(String[] args) {
    Stream<String> ss1 = Stream.of("MY_AGE", "YOUR_LIFE");

    // 아래 람다식에서 스트림을 생성
    Stream<String> ss2 = ss1.flatMap(s-> Arrays.stream(s.split("_"))); // 두 개의 문자열을 대상으로 매핑을 진행해서 네 개의 문자열이 되게 했다.
    ss2.forEach(s-> System.out.println(s + "\t"));
    System.out.println();
  }
}
