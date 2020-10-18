package date_and_time;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class HowLongSequential {
  public static long fibonacci(long n){
    if(n == 1 || n == 2)
      return 1;
    return fibonacci(n - 1) + fibonacci( n - 2);
  }

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(40, 41, 42, 43, 44, 45);

    Instant start = Instant.now(); // 스톱워치 시작

    // 순차 스트림
    /*
    nums.stream()
        .map(n -> fibonacci(n))
        .forEach(r -> System.out.println(r));
     */

    // 병렬 스트림
    nums.parallelStream()
        .map(n -> fibonacci(n))
        .forEach(r -> System.out.println(r));

    Instant end = Instant.now(); // 스톱워치 멈춤
    System.out.println("Sequential Processing : " + Duration.between(start, end).toMillis());
  }
}

// 순차 스트림 결과 -> Sequential Processing : 8903
// 병렬 스트림 결과 -> Sequential Processing : 4059 (순차스트림보다 두배정도 빠름.)

// 하지만 nums의 원소가 "5,6,7,8,9"일 경우 순차 스트림이 더 빠름.