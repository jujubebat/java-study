package java_basic_class;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] ar = {33,55,11,44,22};

        Arrays.sort(ar); // 이진 탐색을 위해 오름차순 정렬을 한다.

        for(int n : ar)
            System.out.print(n + "\t");
        System.out.println();

        int idx = Arrays.binarySearch(ar, 33); // 이진탐색을한다.
        System.out.println("Index of 33: " + idx);

    }
}
