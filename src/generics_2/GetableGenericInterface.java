package generics_2;

interface Getable<T>{
    public T get();
}

// 인터페이스 Getable<T>를 구현하는 Box<T> 클래스
class Box9<T> implements Getable<T>{

    private T ob;
    public void set(T o){ob = o;}

    @Override
    public T get(){return ob;}
}

class Toy4{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

public class GetableGenericInterface {
    public static void main(String[] args) {
        Box9<Toy4> box = new Box9<>();
        box.set(new Toy4());

        // Box<T>가 Getable<T>를 구현하므로 참조 가능
        Getable<Toy4> gt = box;
        System.out.println(gt.get());
    }
}
