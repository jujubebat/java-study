package Lambda;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        Function<Double, Double> cti_1 = d -> d * 0.393701;
        Function<Double, Double> itc_1 = d -> d * 2.54;
        System.out.println("1cm = " + cti_1.apply(1.0) + "inch"); // cm을 inch로
        System.out.println("1inch = " + itc_1.apply(1.0)+"cm"); // inch를 cm으로

        System.out.println();

        // 반환형과 매개변수형이 동일한 인터페이스의 이름은 Operator로 끝나는 규칙이 있다.
        DoubleUnaryOperator cti_2 = d -> d * 0.393701;
        DoubleUnaryOperator itc_2 = d -> d * 2.54;
        System.out.println("1cm : " + cti_2.applyAsDouble(1.0) + "inch");
        System.out.println("1inch : " + itc_2.applyAsDouble(1.0) + "cm");

    }
}

// Function<T,R>의 추상 메소드는 전달 인자와 반환 값이 있는 가장 보편적인 형태이다.
