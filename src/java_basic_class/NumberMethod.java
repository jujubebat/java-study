package java_basic_class;

public class NumberMethod {
    public static void main(String[] args) {
        Integer num1 = new Integer(29);
        System.out.println(num1.intValue()); // int형 값으로 변환
        System.out.println(num1.doubleValue()); // double형 값으로 반환

        Double num2 = new Double(3.14);
        System.out.println(num2.intValue()); // int형 값으로 변환
        System.out.println(num2.doubleValue()); // double형 값을 변환
    }
}
