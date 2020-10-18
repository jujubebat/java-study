package stream_2;

import java.util.Arrays;

class Report{
  private int kor; // 국어 점수
  private int eng; // 영어 점수
  private int math; // 수학 점수

  public Report(int k, int e, int m){
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

public class GradeAverage90 {

  public static void main(String[] args) {
    Report[] cards = {
        new Report(98, 84, 90),
        new Report(92, 87,95),
        new Report(85, 99, 93)
    };

    boolean b1 = Arrays.stream(cards)
        .mapToDouble(r->(r.getKor() + r.getEng() + r.getMath())/3.0)
        .anyMatch(avg -> avg >= 90.0);
    System.out.println("평균 90 이상이 한 명 이상 존재합니다. " + b1);

    if(b1 = true){
      boolean b2 = Arrays.stream(cards)
          .mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0)
          .allMatch(avg -> avg >= 90.0);
      System.out.println("모두 평균 90 이상입니다. " + b2);
    }
  }
}
