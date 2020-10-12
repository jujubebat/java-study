package generics_2;

class Box5<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}

    @Override
    public String toString(){
        return ob.toString();
    }
}

// Box5<? super Integer> box
// box는 Box<T> 인스턴스를 참조하는 참조 변수다.
// 단 이때 Box<T> 인스턴스의 T는 Integer 또는 Integer가 상속하는 클래스여야한다.

class Unboxer3{
    public static void peekBox(Box5<? super Integer> box){
        System.out.println(box);
    }
}

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        Box5<Integer> iBox = new Box5<Integer>();
        iBox.set(5577);

        Box5<Number> nBox = new Box5<Number>();
        nBox.set(new Integer(9955));

        Box5<Object> oBox = new Box5<Object>();
        oBox.set("My Simple Instance");

        Unboxer3.peekBox(iBox);
        Unboxer3.peekBox(nBox);
        Unboxer3.peekBox(oBox);

    }
}
