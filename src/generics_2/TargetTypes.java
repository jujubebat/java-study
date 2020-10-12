package generics_2;

class Box2<T>{
    private T ob;
    public void set(T o){ ob = o;}
    public T get() {return ob;}
}

class EmptyBoxFactory{
    public static <T> Box2<T> makeBox(){ // 제네릭 메소드
        Box2<T>  box = new Box2<>(); // 상자 생성
        return box;
    }
}

public class TargetTypes {
    public static void main(String[] args) {
        Box2<Integer> iBox = EmptyBoxFactory.makeBox();
        iBox.set(25);
        System.out.println(iBox.get());

    }
}
