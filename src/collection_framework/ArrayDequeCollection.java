package collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeCollection {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();
        Deque<String> deq2 = new LinkedList<>(); //

        // LinkedList<E> 클래스는 List<E>, Deque<E>, Queue<E> 3가지 인터페이스를 모두 구현한다.
        // 어떤 타입의 참조변수로 참조하는냐에 따라 LinkedList<E>의 성격이 결정된다.

        // 앞으로 넣고
        deq.offerFirst("1.Box");
        deq.offerFirst("2.Toy");
        deq.offerFirst("3.Robot");

        // 앞에서 꺼내기
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
    }
}
