package console_input_output;

import java.util.Scanner;

public class ScanningString {
    public static void main(String[] args) {
        String source = "1 3 5";
        Scanner sc = new Scanner(source); // Scanner 인스턴스 생성

        int num1 = sc.nextInt(); // int형 데이터 추출
        int num2 = sc.nextInt(); // int형 데이터 추출
        int num3 = sc.nextInt(); // int형 데이터 추출

        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, sum);
    }

}