package stream_1;

import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo{ // 장난감 모델 별 가격 정보
  private String model; // 모델 명
  private int price; // 가격

  public ToyPriceInfo(String m, int p){
    model = m;
    price = p;
  }

  public int getPrice(){
    return price;
  }

}

public class ToyStream { // 장난감 모델 별 가격 정보

  public static void main(String[] args) {
    List<ToyPriceInfo> ls = new ArrayList<>();
    ls.add(new ToyPriceInfo("GUN_LR_45", 200));
    ls.add(new ToyPriceInfo("TEDDY_BEAR_S_013", 350));
    ls.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719",900));

    int sum = ls.stream() // ToyPriceInfo 리스트에 대한 스트림을 생성한다.
        .filter(p->p.getPrice() < 500) // ToyPriceInfo의 Price가 500 미만인 데이터들만 모아서 스트림을 생성했다.
        .mapToInt(t -> t.getPrice()) // 가격이 500 미만인 ToyPriceInfo 인스턴스에 저장되어있는 Price를 꺼내서 int형 스트림을 생성했다.
        .sum(); // int 형 스트림에 저장된 총 합을 계산하여 반환했다.

    System.out.println("sum = " + sum);
  }

}
