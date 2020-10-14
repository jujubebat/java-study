package collection_framework;

import java.util.*;

public class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        list = new ArrayList<>(list);

        // 정렬 이전 출력
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + " ");
        System.out.println();

        // 정렬
        Collections.sort(list);

        // 정렬 이후 출력
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + " ");
        System.out.println();
    }
}
