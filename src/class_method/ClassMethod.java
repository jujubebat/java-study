package class_method;

class NumberPrinter{
    private int myNum = 0;

    static void showInt(int n){ // 클래스 메소드 (static 메소드)
        System.out.println(n);
    }

    static void showDouble(double n){ // 클래스 메소드
        System.out.println(n);
    }

    void setMyNum(int n){
        myNum = n;
    }

    void showMyNumber(){ // 인스턴스 메소드
        showInt(myNum); // 클래스 내부에서 클래스 메소드 호출
    }
}

public class ClassMethod {

    // main 메소드는 인스턴스가 생성되기 전에 호출되므로 static으로 선언되어있다. 클래스 메소드다.
    // 또한 main 메소드는 클래스 외부에서 호출이 이루어지므로 public으로 선언되어있다.
    public static void main() {
        NumberPrinter.showInt(20); // 클래스 이름을 통한 클래스 메소드 호출

        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15); // 인스턴스 이름을 통한 클래스 메소드 호출
        np.setMyNum(75);
        np.showMyNumber();
    }
}

// 클래스 메소드로 구성되어, 인스턴스의 생성을 목적으로 설계되지 않은 클래스들도 존재한다.
// 클래스 메소드에서 인스턴스 변수나 인스턴스 메소드에 접근할 수 없다.
// 클래스 메소드는 특정 인스턴스에 속하지 않기 떄문이다.
// 클래스 변수나 클래스 메소드는 인스턴스 생성 이전에 메모리에 존재한다.