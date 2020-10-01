package Information_hiding.zoo;

// Duck은 defalut로 선언되었으므로 동일 패키지 내에서만 인스턴스 생성가능
class Duck{
    private int numLeg = 2; // private로 선언된 클래스 내부에서만 접근 가능

    public void md1(){
        System.out.println(numLeg); // 접근 가능
        md2();
    }

    private void md2(){
        System.out.println(numLeg); // 접근 가능
    }

    void md3(){
        System.out.println(numLeg); // 접근 가능
        md2(); // 호출 가능
    }
}

// Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성가능
// 하나의 소스파일에 public 클래스는 단 하나만 존재해야한다.
// 소스파일의 이름과 public으로 선언된 클래스의 이름을 일치시켜야한다.
public class Cat {
    public void makeCat(){
        // Duck과 같은 패키지로 묶여 있으니 Duck 인스턴스 생성 가능
        Duck quack = new Duck();
    }

    // public으로 선언된 메서드, 따라서 어디서든 호출 가능하다.
    public void makeSound(){
        System.out.println("야옹\n");
    }

    // default로 선언된 메서드, 따라서 동일 패키지로 묶인 클래스 내에 한정하여 호출가능
    void makeHappy(){
        System.out.println("스마일");
    }

}
