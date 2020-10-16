package method_rederences;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,3,5,7,9);
        ls = new ArrayList<>(ls);

        // Consumer<T> 인터페이스의 추상 메서드 :  void accept(T t)
        // Consumer<List<Integer>> c = l -> Collections.reverse(l); // 람다식
        Consumer<List<Integer>> c = Collections::reverse; // List 인터페이스의 static 메소드 reverse 참조 예시.
        c.accept(ls); // 순서 뒤집기 진행. 전달 인자 ls를 reverse 메소드에 그대로 전달하게 된다.
        System.out.println(ls); // 출력
    }
}


// 람다식은 결국 메소드의 정의이다. 따라서 다음과 같이 생각해 볼 수 있다.
// "이미 정의되어 있는 메소드가 있다면, 이 메소드의 정의가 람다식을 대신할 수 있지 않을까?"
// 자바 8에서 소개된 '메소드 참조'라는 방법을 통해서 이러한 일이 가능하다.
// 메소드 참조의 유형은 총 4가지로 아래와 같다.
// static 메소드의 참조, 참조변수를 통한 인스턴스 메소드 참조, 클래스 이름을 통한 인스턴스 메소드 참조, 생성자 참조