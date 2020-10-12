package generics_1;

class Apple{
    public String toString(){
        return "I am an apple.";
    }
}

class Orange{
    public String toString(){
        return "I am an orange";
    }
}

class Box<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}

// 제네릭이란 인스턴스 생성시 자료형이 결정되는 것이다.
// 타입 매개변수 Box<T>에서 T
// 타입 인자 Box<Apple>에서 Apple
// 매개변수화 타입(제네릭 타입) Box<Apple>
// 타입 매개변수 이름은 다음의 규칙을 지킨다. 1. 한 문자로 이름을 짓는다. 2. 대문자로 이름을 짓는다.

public class FruitAndBox_Generic {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>(); // T를 Apple로 결정
        Box<Orange> oBox = new Box<Orange>(); // T를 Orange로 결정

        aBox.set(new Apple()); // 사과를 상자에 담는다.
        oBox.set(new Orange()); // 오렌지를 상자에 담는다.

        Apple ap = aBox.get(); // 사과를 꺼내는데 형 변환 하지 않는다. 제네릭이어서!
        Orange og = oBox.get(); // 오렌지를 꺼내는데 형 변환 하지 않는다. 제네릭이어서!

        System.out.println(ap);
        System.out.println(og);
    }
}
