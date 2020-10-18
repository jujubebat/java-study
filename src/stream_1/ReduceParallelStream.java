package stream_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceParallelStream {

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");

    BinaryOperator<String> lc = (s1, s2) -> {
      if(s1.length() > s2.length())
        return s1;
      else
        return s2;
    };

    String str = ls.parallelStream() // 병렬처리를 위한 스트림 생성
        .reduce("",lc);
    System.out.println(str);
  }
}

// 자바는 언어 차원에서 병렬 처리를 지원한다.
// 따라서 프로그래머들은 작업 구성을 신경 쓰지 않고 병렬 처리를 진행할 수 있게 되었다.

// 병렬 스트림을 생성하면 이어지는 연산들은 CPU의 코어 수를 고려하여 적절하게 병렬로 처리가 된다.
// 코어를 여러개 활용하면 연산의 횟수와 단계를 줄일 수 있다는 장점이있다.
