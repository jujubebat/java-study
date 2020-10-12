package generics_1;

interface Eatable{
    public String eat();
}

class Apple2 implements Eatable{
    public String toString(){
        return "I am an apple.";
    }

    @Override
    public String eat(){
        return "Is tastes so good!";
    }
}

class Box4<T extends Eatable>{ // 이렇게 타입인자를 인터페이스로 제한할 수 있다.
    T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        System.out.println(ob.eat()); // 타입 인자를 Eatable로 제한했기 때문에 eat 호출 가능!
        return ob;
    }
}

public class BoundedInterfaceBox {
    public static void main(String[] args) {
        Box4<Apple2> box = new Box4<>();
        box.set(new Apple2()); // 사과 저장

        Apple2 ap = box.get(); // 사과 꺼내기
        System.out.println(ap);
    }
}


// 타입인자 제한시 하나의 클래스와 하나 이상의 인터페이스에 대해 동시에 제한을 할 수 가 있다.
// class Box<T extends Number & Eatable{...}
