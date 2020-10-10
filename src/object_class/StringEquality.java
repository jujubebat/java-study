package object_class;

public class StringEquality {
    public static void main(String[] args) {
        String str1 = new String("So Simple");
        String str2 = new String("So Simple");

        if(str1 == str2)
            System.out.println("str1, str2 참조 대상 동일하다.");
        else
            System.out.println("str1, str2 참조 대상 다르다.");

        if(str1.equals(str2))
            System.out.println("str1, str2 내용 동일하다.");
        else
            System.out.println("str1, str2 내용 다르다.");
    }
}

// 자바에서 제공하는 표준 클래스의 경우 equals 메소드가 내용 비교를 하도록 이미 오버라이딩 되어 있는 경우가 많다.
// 두 인스턴스의 내용 비교를 원한다면 Object 클래스의 equals 메소드를 오버라이딩 하자
// 단순히 참조 변수의 참조 값을 비교하려면 == 연산을 하자.
