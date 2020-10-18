package stream_1;

import java.util.Arrays;
import java.util.List;

public class MapToInt {

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Box", "Robot", "Simple");
    ls.stream()
        .map(s->s.length())
        .forEach(n -> System.out.print(n + "\t"));
    System.out.println();
  }

}

// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
// Function<T, R> 인터페이스의 추상 메서드 R apply(T t);

// map은 내부적으로 스트림의 데이터를 하나씩 인자로 전달하며 apply 메소드를 호출한다.
// 그리고 그 결과로 반환된는 값을 모아 새로운 스트림을 생성한다.
// 위 예제의 경우 apply 메소드에 문자열이 전달되고, 그 문자열의 길이가 반환되도록 하는 것이
// 목적이니 다음 추상 메소드의 구현에 해당하는 람다식을 인자로 전달하면 된다.
// Integer apply(String t)


