package inheritance2;

class Cake2{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}

class CheeseCake2 extends Cake2{
    public void yummy(){
        super.yummy(); // Cake2의 yummy 메서드 호출. 상위 클래스에 정의된, 오버라이딩 된 메소드의 호출을 목적으로 super가 사용된다.
        System.out.println("Yummy Cheese Cake");
    }

    public void tasty(){
        super.yummy(); // Cake2의 yummy 메서드 호출
        System.out.println("Yummy Tasty Cake");
    }
}

public class YummyCakeSuper {
    public static void main(String[] args) {
        CheeseCake2 cake = new CheeseCake2();
        cake.yummy();
        cake.tasty();
    }

}
