package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>(); // 컬렉션 인스턴스 생성
        List<String> list = new LinkedList<>();

        // LinkedList<String> list = new LinkedList<>(); -> 왜 이렇게 하지 않느냐?
        // 코드에 유연성을 제공하기 위해 굳이 LinkedList<String>형으로 참조 변수를 선언할 필요가 없다.


        // 컬렉션 인스턴스에 문자열 인스턴스 저장
        list.add("Toy");
        list.add("Rox");
        list.add("Robot");

        // 저장된 문자열 인스턴스의 참조
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();

        list.remove(0); // 첫 번째 인스턴스 삭제

        // 첫 번쨰 인스턴스 삭제 후 나머지 인스턴스들 참조.
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();

    }
}

/*
[ArrayList]
ArrayList 인스턴스는 내부적으로 배열을 생성해서 인스턴스를 저장한다.
필요에 따라 배열의 길이를 스스로 조정한다.

단점 : 저장 공간을 늘리는 과정에서 시간이 비교적 많이 소요된다.
      인스턴스의 삭제 과정에서 많은 연산이 필요할 수 있다. 따라서 느릴 수 있다.

장점 : 저장된 인스턴스의 참조가 빠르다. 배열의 인덱스로 랜덤 엑세스할 수 있다.

[LinkedList]
LinkedList 인스턴스는 연결리스트라는 자료구조를 기반으로 디자인된 클래스다.
'칸칸이 연결된 화물 열차'를 생각하면 된다.

단점 : 저장된 인스턴스의 참조 과정이 느리다. 맨 앞 또는 맨 뒤에서부터 하나씩 검색해봐야한다.

장점 : 저장공간을 늘리는 과정이 간단하고 삭제 과정이 단순하다. (연결리스트이기 때문에)

 */
