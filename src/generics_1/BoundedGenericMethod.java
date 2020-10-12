package generics_1;

class Box6<T> {
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}

// <T extends Number>는 타입 인자를 Number를 상속하는 클래스로 제한함을 의미한다.
class BoxFactory2{
    public static <T extends Number> Box6 makeBox(T o){
        Box6<T> box = new Box6<T>();
        box.set(o);

        // 타입 인자 제한으로 inValue 호출 가능.
        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}

// 타입 인자를 Number를 상속하는 클래스로 제한
class Unboxer{
    public static <T extends Number> T openBox(Box6<T> box){

        // 타입 인자 제한으로 intValue 호출 가능.
        System.out.println("Unboxed data : " + box.get().intValue());
        return box.get();
    }
}

public class BoundedGenericMethod {
    public static void main(String[] args) {
        Box6<Integer> sBox= BoxFactory2.makeBox(new Integer(5959));
        int n = Unboxer.openBox(sBox);
        System.out.println("Returned data : " + n);
    }
}
