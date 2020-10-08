package console_input_output;

import java.util.Scanner;

public class ScanningKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(); // int형 데이터 추출
        int num2 = sc.nextInt(); // int형 데이터 추출
        int num3 = sc.nextInt(); // int형 데이터 추출

        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, sum);
    }
}
