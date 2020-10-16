package method_rederences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort{
    public void sort(List<?> lst){ // 인스턴스 메소드
        Collections.reverse(lst);
    }
}

public class ArrangeList3 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);
        JustSort js = new JustSort();

        Consumer<List<Integer>> c = l -> js.sort(l); // 람다식
        c.accept(ls);
        System.out.println(ls);
    }

}

// 람다식에서 같은 지역 내에 선언된 참조 변수 js에 접근하고 있다.
// 람다식이 인스턴스의 생성으로 이어진다는 사실을 고려하면 다소 특이한 일이다.
// 어찌되었건 람다식에서 같은 지역에 선언된 참조변수에 접근하는 것은 가능하다.
// 단 람다식에서 접근 가능한 참조변수는 final로 선언되었거나 effectively final이어야 한다.
// 변수가 effectively final이라는 것은 '사실상 final 선언이 된 것과 다름없음'을 뜻한다.
// 위예제에서 js는 effectively final이다. js가 참조하는 대상을 수정하지 않기 때문이다.
// 만약 위 예제를 아래와 같이 바꾼다면,
//     JustSort js = new JustSort(); 뒤에 js = new JustSort(); // 다른 인스턴스를 참조하게 했다.
// 참조 변수 js는 effectively final가 아니게 되고 컴파일 오류가 발생한다.
// 람다식으로 생성된 인스턴스 내에서 final로 선언되지 않았거나 effectively final이 아닌 참조변수를 참조하게
// 하는 것은 논리적 혼란을 일으키거나 예측 불가능한 상황으로 이어질 수 있어서 이러한 제한을 두는 것이다.