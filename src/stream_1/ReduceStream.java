package stream_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStream {

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");

    BinaryOperator<String> lc = (s1, s2) -> { // 인자로 두 개의 문자열을 전달받아서 그 길이를 비교하여 긴 문자열을 반한하는 람다식
      if(s1.length() > s2.length())
        return s1;
      else
        return s2;
    };

    String str = ls.stream()
        .reduce("",lc); // 스트림이 빈 경우 빈 문자열 반환.
    System.out.println(str);
  }
}

// 리덕션은 데이터를 축소하는 연산을 뜻한다. sum도 리덕션 연산이다.
//  T reduce(T identity, BinaryOperator<T> accumulator); 메소드는 다른 리덕션 연산에 비해 활용도가 높다.
// 다른 리덕션 연산의 경우 연산의 내용이 이미 정해진 상태이지만 reduce는 전달하는 람다식에 의해 연산의 내용이 결정되기 때문이다.
// reduce 호출시 BinaryOperator<T>의 추상 메서드에 대한 람다식을 전달해야한다.
// 그러면 reduce는 내부적으로 apply를 호출하면서 스트림에 저장된 데이터를 이진 형식으로 줄여나간다.