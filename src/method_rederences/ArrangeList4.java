package method_rederences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class Sort{
    public void sort(List<?> lst){ // 인스턴스 메소드
        Collections.reverse(lst);
    }
}

public class ArrangeList4 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);
        Sort ss = new Sort();

        //Consumer<List<Integer>> c = l -> ss.sort(l); // 람다식
        Consumer<List<Integer>> c = ss::sort; // 메소드 참조기반
        c.accept(ls);
        System.out.println(ls);
    }
}
