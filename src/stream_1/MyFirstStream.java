package stream_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyFirstStream {

  public static void main(String[] args) {
    int[] ar = {1, 2, 3, 4, 5};
    IntStream stm1 = Arrays.stream(ar);// ar에 저장된 데이터를 대상으로 스트림 생성, 그리고 그 스트림을 stm1이 참조
    IntStream stm2 = stm1.filter(n -> n%2 == 1); // 중간연산 : stm1이 참조하는 스트림을 대상으로 filter 연산진행
    // 짝수는 걸러지고 홀수만 통과하여 다시 스트림이 형성된다.

    // 스트림은 데이터의 복사본이라고 생각하면 된다.

    int sum = stm2.sum(); // 최종 연산 진행. 스트림의 데이터를 모두 더하고 그 결과를 반환하는 연산이다.
    System.out.println(sum);
  }

}

// 위의 예제에서는 배열에 저장된 데이터로 스트림을 생성하여 짝수를 걸러내는 파이프와
// 스트림의 모든 데이터를 더하는 파이프를 통과시켜 '홀수의 합'을 계산했다.