package generics_2;

class Box7<T> {
    private T ob;
    public void set(T o){ob =o;}
    public T get(){return ob;}
}

class Toy2{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

class BoxContentsMover{
    // from에 저장된 내용물을 to로 이동
    public static void moveBox(Box7<? super Toy2> to, Box7<? extends Toy2> form){
        to.set(form.get());
    }
}

public class MoveBoxCentents {
    public static void main(String[] args) {
        Box7<Toy2> box1 = new Box7<>();
        box1.set(new Toy2());
        Box7<Toy2> box2 = new Box7<>();

        // box1에 저장된 내용물 box2로 이동
        BoxContentsMover.moveBox(box2, box1);
        System.out.println(box2.get());
    }
}

// 와일드카드 상한, 하한 정리
/*
와일드카드의 상한과 하한 제한이 필요한 이유의 본질은 그 자체로 이해하기 난해한 부분이 있다.
그러니 한 번 이해하고 나면 다음과 같이 Box<T>를 대상으로 정리를 해두는 것이 좋다.

매개변수 선언 : Box<? extends Toy> box (타입인자를 Toy를 상속하는 클래스로 상한 제한)
 -> box가 참조하는 인스턴스를 대상으로 꺼내는 작업만 허용하겠다는 의미다.

매개변수 선언 : Box<? super Toy> box (타입인자를 Toy의 부모 클래스로 하한 제한)
 -> box가 참조하는 인스턴스를 대상으로 넣는 작업만 허용하겠다 의미다.
 */