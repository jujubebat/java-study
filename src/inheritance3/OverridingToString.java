package inheritance3;

class Cake{
    // Object 클래스의 toString 메서드를 오버라이딩
    public String toString(){
        // Object 클래스의 toString 메서드를 호출하여 반환 결과 출력
        System.out.println(super.toString());
        return "My birthday cake";
    }
}

class CheeseCake extends Cake{
    // Cake 클래스의 toString 메소드를 오버라이딩
    public String toString(){
        return "My birthday cheese cake";
    }
}


public class OverridingToString {
    public static void main(String[] args) {
        Cake c1 = new Cake();
        Cake c2 = new CheeseCake();

        // c1이 참조하는 인스턴스의 toString 메서드 호출로 이어진다.
        System.out.println(c1);
        System.out.println();

        // c2가 참조하는 인스턴스의 toString 메서드 호출로 이어진다.
        System.out.println(c2);
    }
}
