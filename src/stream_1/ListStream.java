package stream_1;

import java.util.Arrays;
import java.util.List;

public class ListStream {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("Toy", "Robot", "Box");
    list.stream()
        .forEach(s -> System.out.println(s + "\t"));
    System.out.println();
  }

}
