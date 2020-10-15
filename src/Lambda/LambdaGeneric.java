package Lambda;

// "추상 메서드"가 딱 하나만 존재하는 인터페이스다.
// 이러한 인터페이스를 가리켜 함수형 인터페이스라 한다.
// @FunctionalInterface 어노테이션은 함수형 인터페이스에 부합하는지를 확인하는 어노테이션이다.
@FunctionalInterface
interface Calculate3<T>{ // 제네릭 기반의 함수형 인터페이스
    T cal(T a, T b); // 단 하나의 추상 메서드
    static int add(int a, int b){
        return a+b;
    }
}

public class LambdaGeneric {
    public static void main(String[] args) {
        Calculate3<Integer> ci = (a, b) -> a+b;
        System.out.println(ci.cal(4,3));

        Calculate3<Double> cd = (a,b) -> a + b;
        System.out.println(cd.cal(4.32,3.45));
    }
}
