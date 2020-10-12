package java_basic_class;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer iObj = new Integer(10); // 박싱
        Double dObj = new Double(3.14); // 박싱

        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        int num1 = iObj.intValue(); // 언박싱
        double num2 = dObj.doubleValue(); // 언박싱

        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        // 레퍼 인스턴스 값의 증가 방법
        iObj = new Integer(iObj.intValue() + 10);
        dObj = new Double(dObj.doubleValue() + 1.2);

        System.out.println(iObj);
        System.out.println(dObj);
    }
}
