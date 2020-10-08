package console_input_output;

public class FormatString {
    public static void main(String[] args) {
        int age = 20;
        double height = 178.2;
        String name = "PARK BYUNG WOOK";

        System.out.printf(" name: %s \n", name);
        System.out.printf(" age : %d \n height : %e \n\n", age, height);

        System.out.printf(" %d - %o - %x \n\n", 77,77,77); // 10진수, 9진수, 16진수 형태로 출력
        System.out.printf(" %g \n",0.00014);
        System.out.printf(" %g \n",0.000014);
    }
}
