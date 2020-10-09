package inheritance3;

class ParentAdder{
    public int add(int a, int b){
        return a + b;
    }
}

class ChildAdder extends ParentAdder{
    // 상위 클래스의 add를 오버라이딩 하려 합니다.
    @Override // 이렇게 오버라이드 어노테이션을 통해, 오버라이드가 정상적으로 됐는지 확인할 수 있다. 만약 반환형 또는 매개변수 형태와 개수가 다르다면 빨간줄이 뜰 것이다.
    public int add(int a, int b){
        System.out.println("덧셈을 진행합니다.");
        return a + b;
    }
}

public class OverrideMistake {
    public static void main(String[] args) {
        ParentAdder adder = new ChildAdder();
        System.out.println(adder.add(3,4));
    }
}
