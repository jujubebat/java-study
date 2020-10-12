package generics_2;

class Box8<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}
}

class Toy3{
    @Override
    public String toString(){return "I am a Toy";}
}

class Robot3{
    @Override
    public String toString(){return "I am a Robot";}
}

/*

예를들어, BoxHanler2 클래스에서 아래 두 개의 함수를 오버로딩하고 싶다.

public static void outBox(Box<? extends Toy> box {...}
public static void outBox(Box<? extends Robot> box {...}

하지만 자바 컴파일러는 제네릭 등장 이전에 정의된 클래스들과의 상호 호환성을 유지하기 위해
컴파일 시 제넥릭과 와일드 카드 관련 정보를 지우는 과정을 거친다. 따라서 위 두 함수는 아래와 같이되어 오버로딩이 불가능해진다.

public static void outBox(Box box) {...} // 제네릭 정보 지워짐!
public static void outBox(Box box) {...} // 제네릭 정보 지워짐!

위와 같이 컴파일러가 제네릭 정보를 지우는 행위를 가리켜 Type Erasure라고 한다.

이 경우 타입 매개변수 선언을 추가하여 해결한다.

아래 BoxHanler2을 보자.

*/

class BoxHandler2{
    public static <T> void outBox(Box8<? extends T> box){
        T t = box.get();
        System.out.println(t);
    }

    public static <T> void inBox(Box8<? super T> box, T n){
        box.set(n);
    }
}

public class BoundedWildcardGenericMethod {
    public static void main(String[] args) {
        Box8<Toy3> tBox = new Box8<>();
        BoxHandler2.inBox(tBox, new Toy3());
        BoxHandler2.outBox(tBox);

        Box8<Robot3> rBox = new Box8<>();
        BoxHandler2.inBox(rBox, new Robot3());
        BoxHandler2.outBox(rBox);
    }
}
