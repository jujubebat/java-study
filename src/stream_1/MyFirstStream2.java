package stream_1;

import java.util.Arrays;

public class MyFirstStream2 {

  public static void main(String[] args) {
    int[] ar = {1, 2, 3, 4, 5};

    int sum = Arrays.stream(ar) // 스트림 생성하고,
        .filter(n -> n%2 == 1) // filter 통과 시키고,
        .sum(); // sum을 통과시켜 그 결과 반환

    System.out.println(sum);
  }

}

// 스트림의 연산은 효율과 성능을 고려하여 '지연(Lazy) 처리' 방식으로 동작한다.
// 위 예제에서는 메소드 호출이 filter에서 sum을 이어지지만, 정작 sum이 호출될 때까지 filter의 호출 결과는 스트림에 반영되지 않는다.
// 즉 최종 연산인 sum이 호출되어야 filter의 호출 결과가 스트림에 반영되고, 이어서 sum의 호출 결과가 스트림에 반영된다.
// 만약 최종 연산인 sum을 수행하지 않는다면? 그전에 아무리 많은 중간 연산을 진행했다 하더라도 의미가 없다.
// 쉽게 말해서 아무런 결과도 보이지 않는다.