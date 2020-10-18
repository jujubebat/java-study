package stream_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfStream {

  public static void main(String[] args) {
    Stream.of(11, 22, 33, 44) // ex 1
      .forEach( n -> System.out.print(n + "\t"));
    System.out.println();

    Stream.of("So Simple")
        .forEach(s -> System.out.print(s + "\t"));
    System.out.println();

    List<String> sl = Arrays.asList("Toy", "Robot", "Box");
    Stream.of(sl) // 이렇게 컬렉션 인스턴스를 전달하면, 인스턴스 하나로 이뤄진 스트림이 생성된다.
        .forEach(w -> System.out.print(w + "\t"));
    System.out.println();


    // 만약 Stream.of 메소드에 배열을 전달하면 그때는 하나의 배열로 이뤄진 스트림이 생성되는 것이 아니라.
    // 배열에 저장된 요소로 이뤄진 스트림이 생성된다.

  }

}
