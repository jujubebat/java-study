package class_method;

import static java.lang.Math.*; // Math 클래스의 모든 클래스 변수와 클래스 메소드에 대해 import 한다.

public class StaticImport {
    public static void main(String[] args) {
        System.out.println(E);
        System.out.println(PI);

        System.out.println(abs(-55));
        System.out.println(max(77,88));
        System.out.println(min(33,55));
    }
}
