package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list); // 이렇게 생성자 기반으로 인스턴스를 생성해야지 추가, 삭제가 가능하다.

        // for문 기반의 반복자 회득과 순차적 참조
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + ' ');
        System.out.println();

        // "Box"를 모두 삭제하기 위한 반복문
        for(Iterator<String> itr = list.iterator(); itr.hasNext();){
            if(itr.next().equals("Box"))
                itr.remove();
        }

        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + ' ');
        System.out.println();
    }
}
