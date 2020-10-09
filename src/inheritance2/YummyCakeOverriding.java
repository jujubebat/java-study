package inheritance2;

class Cake{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake {
    public void yummy(){ // Cake의 yummy 메소드를 오버라이딩 한다. 메소드의 이름, 반환형, 매개변수가 같아야 '메소드 오버라이딩'이 성립한다.
        System.out.println("Yummy Cheese Cake");
    }
}

public class YummyCakeOverriding {
    public static void main(String[] args) {
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy(); // CheeseCake가 Cake의 yummy 메소드를 오버라이딩 했다. 따라서 Cake 형 참조변수로 호출한 yummu 메소드는 CheeseCake의 메소드다.
                    // Cake의 yummy 메소드는 자식 클래스인 CheeseCake의 yummy 메소드에 의해 무효화(오버라이딩) 되었다.
        c2.yummy();
    }
}
