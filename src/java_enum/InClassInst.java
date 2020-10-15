package java_enum;

class Person2{
    public static final Person2 MAN = new Person2();
    public static final Person2 WOMAN = new Person2();

    // 이런식으로 Person2 클래스 내에서 Person2 형 참조변수를 선언하는 것도,
    // Person2 인스턴스를 생성하는 것도 가능하다.

    @Override
    public String toString(){
        return "I am a dog person"; // "나는 개를 사랑하는 사람입니다."
    }
}

public class InClassInst {
    public static void main(String[] args) {
        System.out.println(Person2.MAN);
        System.out.println(Person2.WOMAN);
    }
}
