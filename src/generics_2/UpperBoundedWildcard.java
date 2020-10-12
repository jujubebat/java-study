package generics_2;

class Box4<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}

    @Override
    public String toString(){
        return ob.toString();
    }
}

class Unboxer2{

    // Box4<? extends Number>
    // 아래 peekBox 함수의 매개변수 box는 Box4<T> 인스턴스를 참조하는 참조변수다.
    // 단, 이때 Box4<T> 인스턴스의 T는 Number 또는 이를 상속하는 하위 클래스여야한다. (와일드 카드의 상한 제한)
    // 와일드 카드의 상한 제한 의미 : "인자로 전달되는 대상을 제한하는 것은 그 자체로 프로그램에 안정성을 높여준다."
    public static void peekBox(Box4<? extends Number> box){
        System.out.println(box);
    }
}

public class UpperBoundedWildcard {
    public static void main(String[] args) {
        Box4<Integer> iBox = new Box4<>();
        iBox.set(1234);

        Box4<Double> dBox = new Box4<>();
        dBox.set(10.009);

        Unboxer2.peekBox(iBox);
        Unboxer2.peekBox(dBox);
    }
}
