package java_enum;

enum Person3{
    MAN, WOMAN; // 이 열거형 값은 Person3의 인스턴스를 참조하는 참조 변수다.

    private Person3(){ // 열거형의 디폴트 생성자도 private 로 생성되어있다. 따라서 직접 열거형 인스턴스를 생성하는 것은 불가능
        System.out.println("Person constructor called");
    }

    @Override
    public String toString(){
        return "I am a dog person";
    }
}

// 모든 열거형은 Enum<E> 클래스를 상속한다. Enum<E>은 Object 클래스를 상속한다.
// 이런 측면에서 열거형은 클래스다.

public class EnumConst {
    public static void main(String[] args) {
        System.out.println(Person3.MAN); // toString 메소드의 반환 값 출력.
        System.out.println(Person3.WOMAN); // toString 메소드의 반환 값 출력.
    }
}
