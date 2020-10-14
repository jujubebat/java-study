package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        return s1.compareToIgnoreCase(s2); // 대문자, 소문자 구분 없이 비교
    }
}

public class StringComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOT");
        list.add("APPLE");
        list.add("BOX");

        StrComp cmp = new StrComp(); // 정렬과 탐색의 기준
        Collections.sort(list, cmp);
        int idx = Collections.binarySearch(list, "Robot", cmp); // 탐색
        System.out.println(list.get(idx)); // 탐색 결과 출력
    }
}
