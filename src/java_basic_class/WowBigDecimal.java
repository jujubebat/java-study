package java_basic_class;

import java.math.BigDecimal;

public class WowBigDecimal {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("1.6"); // 이렇게 문자열로 전달해야 오차가 없다. 실수형으로 표현되는 순간부터 오차를 지니기 때문이다.
        BigDecimal d2 = new BigDecimal("0.1");
        System.out.println("덧셈 결과 : " + d1.add(d2));
        System.out.println("곱셈 결과 : " + d1.multiply(d2));
    }
}
