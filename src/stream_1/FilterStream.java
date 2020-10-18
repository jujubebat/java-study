package stream_1;

import java.util.Arrays;
import java.util.List;

public class FilterStream {

  public static void main(String[] args) {
    int[] ar = {1,2,3,4,5};
    Arrays.stream(ar) // 배열 기반 스트림 생성
        .filter(n -> n%2 ==1) // 홀수만 통과 시킨다. 데이터가 홀수이면 true 반환하는 람다식
        .forEach(n -> System.out.print(n + "\t"));
    System.out.println();


    // Stream<T> filter(Predicate<? super T> predicate);
    // Predicate<? super T> 인터페이스의 추상 메서드 : boolean test(T t);
    List<String> sl = Arrays.asList("Toy", "Robot", "Box");
    sl.stream() // 컬렉션 인스턴스 기반 스트림 생성
        .filter(s -> s.length() == 3) // 길이가 3이면 통과 시킨다. 문자열 길이가 3이면 true 반환하는 람다식
        .forEach(s -> System.out.print(s + "\t"));
    System.out.println();
  }
}

// filter 메소드는 내부적으로 스트림의 데이터를 하나씩 인자로 전달하면서
// 매개변수로 들어온(람다로 들어온) predicate의 test 메서드를 호출한다.
// 그 결과 true가 반환되면 해당 데이터는 스트림에 남긴다.
// 반면 false가 반환되면 해당 데이터는 거른다.(버린다.)