package object_class;

class Person{
    String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // 상위 클래스 Object finalize 메소드 호출
        // Object의 finalize 메소드는 아무도 참조하지 않는 인스턴스가 가비지 컬렉션에 의해 소멸되기 전에 자동 호출되는 메소드다.
        System.out.println("destroyed : " + name);
    }
}

public class ObjectFinalize {
    public static void main(String[] args) {
        Person p1 = new Person("Yoon");
        Person p2 = new Person("Park");

        p1 = null; // 참조대상을 가비지 컬렉션의 대상으로 만듦
        p2 = null; // 참조대상을 가비지 컬렉션의 대상으로 만듦

        /*
         위에서 p1, p2를 참조되지 않은 인스턴스로 지정했다.
         하지만 finalize가 호출되지 않는 것을 볼 수 있다.
         이유는 2가지다.
         1. 가비지 컬렉션은 빈번히 일어나지 않는다.
         2. 소멸할 인스턴스가 생겨도 가비지 컬렉션으로 바로 이어지지 않는다.
         가비지 컬렉션을 강제로 진행하지 말자. 가상머신은 매우 합리적인 방법으로 가비지 컬렉션을 수행한다.
         따라서 특별한 상황이 아니면 가비지 컬렉션 동장에 영향을 미치는 메소드 호출을 삼가하는 것이 좋다.
        */

        // System.gc(); // 가비지 컬렉션의 수행을 요청(명령이 아닌 요청)
        // System.runFinalization(); // 소멸이 보류된 인스턴스의 finalize 메소드 호출을 요청(명령이 아닌 요청)

        System.out.println("end of program");

    }
}
