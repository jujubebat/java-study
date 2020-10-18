package stream_2;

import java.util.stream.Stream;

public class InstSortedStream {

  public static void main(String[] args) {
    Stream.of("Box", "Apple", "Robot")
        .sorted()
        .forEach(s -> System.out.print(s + '\t'));
    System.out.println();

    Stream.of("Box", "Apple", "Rabbit")
        .sorted((s1, s2) -> s1.length() - s2.length())
        .forEach(s -> System.out.print(s + '\t'));
    System.out.println();
  }
}
