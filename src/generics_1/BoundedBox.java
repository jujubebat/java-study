package generics_1;

class Box3<T extends Number>{ // 타입 인자로 Number 또는 Number를 상속하는 클래스만 올 수 있다는 뜻이다.
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }

    public int toIntValue(){
        return ob.intValue(); // 타입 인자를 Number로 제한 했으므로 이런식으로 Number 클래스의 메소드를 사용할 수 있게된다!
    }
}

public class BoundedBox {
    public static void main(String[] args) {
        Box3<Integer> iBox = new Box3<>(); // Integer는 Number를 상속
        iBox.set(24);

        Box3<Double> dBox = new Box3<>();
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
