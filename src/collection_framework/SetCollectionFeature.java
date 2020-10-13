package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionFeature {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Toy");
        set.add("Box");
        set.add("Robot");
        set.add("Box");
        System.out.println("인스턴스 수 : " + set.size());

        // 반복자를 이용한 전체 출력
        for(Iterator<String> itr = set.iterator(); itr.hasNext();)
            System.out.println(itr.next() + '\t');
        System.out.println();

        // for-each 문을 이용한 전체 출력
        for(String s : set)
            System.out.println(s + '\t');
        System.out.println();
    }
}
