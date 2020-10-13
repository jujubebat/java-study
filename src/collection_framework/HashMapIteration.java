package collection_framework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class AgeComparator implements Comparator<Integer>{
    public int compare(Integer n1, Integer n2){
        return n2.intValue() - n1.intValue();
    }
}

public class HashMapIteration {
    public static void main(String[] args) {
        //HashMap<Integer, String> map = new HashMap<>(); // HashMap은 해쉬 알고리즘 기반으로 구현되어있다.
        TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator()); // HashMap은 트리 자료구조를 기반으로 구현되어있다. 데이터의 정렬상태를 유지한다. 디폴트는 오름차순

        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // key만 담고 있는 컬렉션 인스턴스 생성
        Set<Integer> ks = map.keySet(); // map의 키세트를 얻어낸다.

        // 전체 key 출력
        for(Integer n : ks)
            System.out.print(n + " ");
        System.out.println();

        // 전체 value 출력
        for(Integer n : ks)
            System.out.print(map.get(n) + " ");
        System.out.println();

        // 전     체 value 출력(반복자 기반)
        for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
            System.out.print(map.get(itr.next()) + " ");
        System.out.println();
    }
}
