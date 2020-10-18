package stream_2;

import java.util.stream.IntStream;

public class MatchStream {

  public static void main(String[] args) {
    boolean b = IntStream.of(1, 2, 3, 4, 5)
        .allMatch(n -> n%2 == 0); // allMatch :  스트림의 모든 데이터가 전달된 람다식의 조건을 만족하는 경우 true 리턴
    System.out.println("모두 짝수이다." + b);

    b = IntStream.of(1, 2, 3, 4, 5)
        .anyMatch(n -> n%2 == 0); // anyMatch :  스트림의 데이터 중 하나라도 전달된 람다식의 조건을 만족하는 경우 true 리턴
    System.out.println("짝수가 하나는 있다." + b);

    b = IntStream.of(1, 2, 3, 4, 5)
        .noneMatch(n->n%2 == 0); // noneMath : 스트림의 데이터 모두 전달된 람다식의 조건을 만족하지 않는 경우 true 리턴
    System.out.println("짝수가 하나도 없다." + b);
  }
}
