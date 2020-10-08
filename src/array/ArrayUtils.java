package array;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        Arrays.fill(ar1, 7); // 배열 ar1을 7로 초기화
        System.arraycopy(ar1, 0, ar2, 3, 4); // 배열 ar1 0부터를 ar2 인덱스 3부터 4개만큼 복사한다.

        for(int i=0; i<ar1.length; i++)
            System.out.print(ar1[i] + " ");

        System.out.println(); // 단순 줄바꿈

        for(int i=0; i<ar2.length; i++)
            System.out.print(ar2[i] + " ");

    }
}
