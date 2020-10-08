package inheritance1;

class SuperCLS2{
    protected static int count = 0; // 클래스 변수 또는 클래스메서드를 자식 클래스에서 사용하고 싶으면 protected로 선언되어 있어야 한다.

    public SuperCLS2(){
        count++;
    }
}

class SubCLS2 extends SuperCLS2{
    public void showCount(){
        // 상위 클래스에 위치한 클래스 변수 coun에 접근!
        System.out.println(count);
    }
}

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS2 obj1 = new SuperCLS2(); // count 값 1 증가
        SuperCLS2 obj2 = new SuperCLS2(); // count 값 1 증가

        // 아래 인스턴스 생성 과정에서 SuperCLS 생성자가 호출되므로,
        SubCLS2 obj3 = new SubCLS2(); // count 값 1 증가
        obj3.showCount();

    }
}
