package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static List<Integer> makeIntList(Supplier<Integer> s, int n){
        List<Integer> list = new ArrayList<>(); // 컬렉션 인스턴스 생성

        for(int i=0; i<n; i++){
            list.add(s.get()); // 난수를 생성해 담는다.
        }

        return list;
    }

    public static void main(String[] args) {
        Supplier<Integer> spr = () -> {
            Random rand = new Random();
            return rand.nextInt(50);
        };

        List<Integer> list = makeIntList(spr, 5);
        System.out.println(list);

        list = makeIntList(spr, 10);
        System.out.println(list);
    }
}
