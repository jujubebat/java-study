package java_basic_class;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        Integer iObj = 10; // 오토 박싱 진행
        Double dObj = 3.14; // 오토 박싱 진행

        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        int num1 = iObj; // 오토 언박싱 진행
        double num2 = dObj; // 오토 언박싱 진행

        System.out.println(num1);
        System.out.println(num2);
    }
}
