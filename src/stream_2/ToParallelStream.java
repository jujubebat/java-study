package stream_2;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ToParallelStream {

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
    Stream<String> ss = ls.stream(); // 스트림 생성

    BinaryOperator<String> lc = (s1, s2) -> {
      if(s1.length() > s2.length())
        return s1;
      else
        return s2;
    };

    String str = ss.parallel().reduce("",lc); // 병렬 스트림 생성
    System.out.println(str);
  }
}
