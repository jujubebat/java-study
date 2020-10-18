package stream_2;

import java.beans.IntrospectionException;
import java.util.stream.IntStream;

public class LazyOpStream {

  public static void main(String[] args) {
    // 최종 연산이 생략된 스트림의 파이프 라인
    // 최종 연산이 존재하지 않으므로, 중간 연산은 진행되지 않는다.
    IntStream.of(1, 3, 5)
        .peek(d -> System.out.println(d + "\t")); // 중간 연산
    System.out.println();

    // 최종 연산이 존재하는 스트림의 파이프 라인
    // 최종 연산이 존재하므로 중간연산이 진행되는 것을 볼 수 있다.
    IntStream.of(5,3,1)
        .peek(d -> System.out.println(d + "\t")) // 중간연산
        .sum();
    System.out.println();



  }
}
