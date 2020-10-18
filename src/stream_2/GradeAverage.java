package stream_2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ReportCard{
  private int kor; // 국어 점수
  private int eng; // 영어 점수
  private int math; // 수학 점수

  public ReportCard(int k, int e, int m){
    kor = k;
    eng = e;
    math = m;
  }

  public int getKor(){
    return kor;
  }

  public int getEng(){
    return eng;
  }

  public int getMath(){
    return math;
  }

}

public class GradeAverage {

  public static void main(String[] args) {
    ReportCard[] cards = {
        new ReportCard(70, 80, 90),
        new ReportCard(90,80,70),
        new ReportCard(80,80,80)
    };

    // ReportCard 인스턴스로 이뤄진 스트림 생성
    Stream<ReportCard> sr = Arrays.stream(cards);

    // 학생들의 점수 정보로 이뤄진 스트림 생성. flatMapToInt연산을 통해 생성된 스트림에는 모든 학생들의 국, 영, 수에 대한 점수가 담긴다.
    IntStream si = sr.flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()));

    // 평균을 구하기 위한 최종 연산 average 진행
    double avg = si.average().getAsDouble();
    System.out.println("avg. " + avg);
  }

}
