package collection_framework;

import java.util.*;

public class ConversionCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);

        // ArrayList<E> 인스턴스의 순환
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + ' ');
        System.out.println();

        // ArrayList<E> 인스턴스 기반으로 LinkedList<E> 인스턴스 생성
        list = new LinkedList<>(list);

        // LinkedList<E> 인스턴스의 순환
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + ' ');
        System.out.println();
    }
}

// 대다수 컬렉션 클래스들은 다른 컬렉션 인스턴스를 인자로 전달받는 생성자를 가지고 있어서
// 다른 컬렉션 인스턴스에 저장된 데이터를 복사해서 새로운 컬렉션 인스턴스를 생성할 수 있다.
