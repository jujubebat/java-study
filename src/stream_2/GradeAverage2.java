package stream_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class GradeAverage2 {

  public static void main(String[] args) {
    ReportCard[] cards = {
        new ReportCard(70, 80, 90),
        new ReportCard(90,80,70),
        new ReportCard(80,80,80)
    };

    Arrays.stream(cards)
        .flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()))
        .average()
        .ifPresent(avg -> System.out.println("avg. " + avg));
  }
}
