package java_basic_class;

import java.util.StringTokenizer;

public class TokenizeString {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("PM:08:45", ":"); // (문자열, 구분자)

        while (st1.hasMoreTokens()) // 반환할 토큰이 남아 있는가?
            System.out.print(st1.nextToken() + ' '); // 다음 토큰을 반환
        System.out.println();

        StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/ ");

        while (st2.hasMoreTokens())
            System.out.print(st2.nextToken() + ' ');
        System.out.println();
    }
}
