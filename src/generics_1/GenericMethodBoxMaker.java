package generics_1;

class Box5<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}

class BoxFactory{
    public static <T> Box5<T> makeBox(T o){ // 제네릭 메소드 정의
        Box5<T> box = new Box5<>(); // 상자를 생성하고,
        box.set(o); // 전달된 인스턴스를 상자에 담아서,
        return box; // 이 상자를 반환한다.
    }
}

public class GenericMethodBoxMaker {
    public static void main(String[] args) {
        Box5<String> sBox = BoxFactory.makeBox("Sweet");
        System.out.println(sBox.get());

        Box5<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());
    }
}
