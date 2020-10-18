package stream_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectStringStream {

  public static void main(String[] args) {
    String[] words = {"Hello", "Box", "Robot", "Toy"};
    Stream<String> ss = Arrays.stream(words);

    List<String> ls = ss
        .filter(s -> s.length() < 5) // 길이 5미만인 문자열을 걸러내어 스트림을 생성한다.
        .collect(() -> new ArrayList<>(), // 데이터를 저장할 저장소를 생성한다.
            (c, s) -> c.add(s), // c는 collect의 첫 번째 인자를 통해서 생성된 컬렉션 인스턴스다. s는 스트림을 이루는 데이터들이다. 이문장을 통해 컬레션 인스턴스에 스트림의 데이터가 저장된다. 저장이 끝나면 이 컬렉션 인스턴스의 참조 값이 반환되면서 collect 연산은 마무리된다.
            (lst1, lst2) -> lst1.addAll(lst2)); // lst2가 저장하고 있는 모든 데이터가 lst1에 담긴다. 이 예제 처럼 병렬 스트림이 아닌 순차 스트림의 경우 3번째 인자는 사용되지 않는다. 하지만 null을 전달하면 NPE가 발생한다.

    System.out.println();
  }
}
