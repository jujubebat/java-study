package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    // Predicate 인터페이스가 어떤 함수형 인터페이스인지 알고 있다면
    // 람다식으로 구현해서 인자로 넣어주면 된다.
    public static int sum(Predicate<Integer> p, List<Integer> lst){
        int s = 0;
        for(int n : lst){
            if(p.test(n))
                s+=n;
        }
        return s;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 5 ,7 ,9, 11, 12);
        int s;

               // 짝수일때 true
        s = sum(n -> n%2 == 0, list);
        System.out.println("짝수 합 : " + s);

               // 홀수일때 true
        s = sum(n -> n%2 != 0, list);
        System.out.println("홀수 합 : " + s);
    }
}
