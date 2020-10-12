package generics_1;

class Box2<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}

public class BoxInBox {
    public static void main(String[] args) {
        Box2<String> sBox = new Box2<>(); // 제네릭 사용시 이렇게 왼쪽에는 타입 매개변수를 생략할 수 있다. 이를 다이아몬드 기호라고 한다.
        sBox.set("I am so happy.");
        System.out.println(sBox.get());

        Box2<Box2<String>> wBox = new Box2<>();
        wBox.set(sBox);
        System.out.println(wBox.get().get());

        Box2<Box2<Box2<String>>> zBox = new Box2<>(); // 이런식으로 겹겹이 제네릭을 할 수 있다.
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());
    }
}
