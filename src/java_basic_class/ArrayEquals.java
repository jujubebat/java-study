package java_basic_class;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = Arrays.copyOf(ar1, ar1.length);

        // 매개변수 ar1과 ar2로 전달된 배열의 내용을 비교하여 true 또는 false를 반환한다.
        // 두 배열에 저장된 데이터의 수, 순서, 내용이 같으면 true를 반환한다.
        System.out.println(Arrays.equals(ar1,ar2));
    }
}
