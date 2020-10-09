package inheritance2;

class Cake3{
    public int size; // cake size

    public Cake3(int sz){
        size = sz;
    }

    public void showCakeSize(){
        System.out.println("Bread Ounces : " + size);
    }
}

class CheeseCake3 extends Cake3{
    public int size; // cheese size

    public CheeseCake3(int sz1, int sz2){
        super(sz1);
        size = sz2;
    }

    public void showCakeSize() {
        // super.size는 부모 클래스의 멤버 size를 의미한다.
        System.out.println("Bread Ounces : " + super.size);

        // size는 이 클래스 CheeseCake의 멤버 size를 의미한다.
        System.out.println("Cheese Ounces : " + size);
    }
}

public class YummyCakeSize {
    public static void main(String[] args) {
        CheeseCake3 ca1 = new CheeseCake3(5, 7);
        Cake3 ca2 = ca1;

        // ca2는 Cake3 형이므로 ca2.size는 Cake3의 멤버 size를 의미한다.
        System.out.println("Bread Ounces : " + ca2.size); // Cake3의 멤버 변수 size는 오버라이드 되지 않았다!

        // 변수, 클래스 변수, 클래스 메소드는 참조 변수의 형에 따라 접근이결정된다.
        // 다시 말해 변수, 클래스 변수, 클래스 메소드는 오버라이딩 대상이 아니다.

        // ca1는 CheeseCake3형이므로 ca1.size는 CheeseCake의 멤버 size를 의미한다.
        System.out.println("Cheese Ounces : " + ca1.size);

        System.out.println(); // 공백

        ca1.showCakeSize();

        System.out.println(); // 공백

        ca2.showCakeSize(); // showCakeSize는 자식클래스 CheeseCake3에 의해 오버라이딩 되었다.
    }
}
