package stream_2;

import java.util.stream.IntStream;

public class OpIntStream {

  public static void main(String[] args) {
    // 합
    int sum = IntStream.of(1, 3, 5, 7, 9)
        .sum();
    System.out.println("sum : " + sum);

    // 개수
    long cnt = IntStream.of(1, 3, 5, 7, 9)
        .count();
    System.out.println("count : " + cnt);

    // 평균
    IntStream.of(1, 3, 5, 7, 9)
        .average()
        .ifPresent(av -> System.out.println("avg = " + av));

    // 최대
    IntStream.of(1, 3, 5, 7, 9)
        .max()
        .ifPresent(mx -> System.out.println("max = " + mx));
  }

}
