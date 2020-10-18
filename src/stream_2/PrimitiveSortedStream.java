package stream_2;

import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveSortedStream {

  public static void main(String[] args) {
    IntStream.of(3, 9, 4, 2)
        .boxed()
        .sorted(Collections.reverseOrder()) // 내림차순 정렬
        .forEach(i -> System.out.print(i + "\t"));
    System.out.println();

    DoubleStream.of(3.3, 6.2, 1.5, 8.3)
        .sorted()
        .forEach(d -> System.out.print(d + "\t"));
    System.out.println();
  }

}
