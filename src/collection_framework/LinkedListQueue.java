package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        // LinkedList<E>는 List<E> 인터페이스를 구현하면서, 동시에 Queue<E> 인터페이스를 구현하는 클래스다.
        // 따라서 어떠한 타입의 참조변수로 참조하느냐에 따라서 리스트로도 동작하고 큐로도 동작한다.
        Queue<String> que = new LinkedList();
        que.offer("Toy");
        que.offer("Robot");
        que.offer("Box");

        // add(넣기), remove(꺼내기), element(확인하기) 메서드는 꺼낼 인스턴스가 없을 때
        // 혹은 저장공간이 부족할 때 예외를 발생시킨다.
        // 하지만 다음 3메소드 offer(넣기), poll(꺼내기), peek(확인하기)는 동일한 상황에서 예외를 발생시키지 않고
        // 해당 상황을 알리기 위한 특정 값(null 또는 false를 반환한다.)

        // 무엇이 다음에 나올지 확인
        System.out.println("nex : " + que.peek());

        // 첫 번째, 두 번째 인스턴스 꺼내기
        System.out.println(que.poll());
        System.out.println(que.poll());

        // 무엇이 다음에 나올지 확인
        System.out.println("next : " + que.peek());

        // 마지막 인스턴스 꺼내기
        System.out.println(que.poll());

    }
}
