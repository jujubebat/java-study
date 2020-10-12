package generics_2;

class Box6<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}
}

class Toy{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

class BoxHandler {

    // 상한 제한의 목적에 대해서 알아보자.

    /*
    public static void outBox(Box<Toy> box){
        Toy t = box.get(); // 상자에서 꺼내기
        System.out.println(t);

        // 1. outBox내에서 실수로 Toy를 저장하는 set 메소드를 호출한다면? 컴파일 과정에서 오류가 발견되지 않는다.
        // 2. box.set(new Toy());
    }
     */

    /*
    위 메소드는 box에서 객체를 꺼내기만 하면 되는 함수다.
    따라서 위 메소드에서 매개변수로 들어오는 참조변수를 통해 get 메서드만 가능해야한다. set 메서드는 제한 하는 것이 좋다.
    왜 좋냐? "필요한 만큼만 기능을 허용하여, 코드의 오류가 컴파일 과정에서 최대한 발견되도록 하는 것이 좋기 때문이다."
    */

    // 아래와 같이 Box<? extends Toy> box 제한을 걸어버리면
    // box.set(new Toy()); 문장은 오류가 난다. box 참조변수의 형은 Toy로 상속하는 어떤 클래스던 올 수 있으니
    // 위와 같이 Toy 객체를 만들어서 매개변수로 넘겨주는 문장이 오류가 나기 때문이다.

    // 아래와 같이 outBox 메서드에서는 box가 참조하는 인스턴스에 Toy 인스턴스를 저장하는 메소드 호출은 불가능하게 만들었다.
    public static void outBox(Box<? extends Toy> box){
        Toy t = box.get(); // 상자에서 꺼내기
        //box.set(new Toy()); // 오류 발생
        System.out.println(t);
    }

    // 아래 함수에서 box.get(n)도 불가능하게 해야한다.
    // 우리는 필요한 만큼의 기능을 허용하여, 코드의 오류가 컴파일 과정에서 최대한 발견되도록 해야한다.
    // 이번에는 상한 제한으로 해결할 수 있다.
    /*
    public static void inBox(Box<Toy> box, Toy n){
        box.set(n); // 상자에 넣기
    }
     */
    // Box<? super Toy> box 에서 제네릭 타입은 Toy 클래스가 상속하는 부모 클래스들로 제한된다.
    // 그렇게되면 box.get()은 항상 Toy가 아니다. 따라서 Toy myToy = box.get(); 문장에 컴파일 오류가 걸리게된다.
    // 우리의 목적 "필요한 만큼 기능을 허용하여, 코드의 오류가 컴파일 과정에서 최대한 발견되도록 해야한다."을 달성할 수 있다.
    public static void inBox(Box<? super Toy> box, Toy n){
        box.set(n); // 넣는 것! OK!
        // Toy myToy = box.get(); // 오류 발생! box
    }
}

public class BoundedWildcardBase {
    public static void main(String[] args){
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
