package inheritance2;

class MobilePhone{
    protected String number;

    public MobilePhone(String num){
        number = num;
    }

    public void answer(){
        System.out.println("Hi~ from " + number);
    }
}

class SmartPhone extends MobilePhone {
    private String androidVer;

    public SmartPhone(String num, String ver){
        super(num);
        androidVer = ver;
    }

    public void playApp(){
        System.out.println("App is running in " + androidVer);
    }
}

public class MobileSmartPhone {
    public static void main(String[] args) {

        SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");
        MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat"); // 1.자식 클래스 인스턴스를 부모 클래스의 참조 변수에 대입 가능하다.

        ph1.answer();
        ph1.playApp();

        System.out.println();

        ph2.answer();
        // ph2.playApp(); // 참조 변수의 형을 기준으로 접근 가능한 멤버를 제한한다. 즉 참조 변수가 MobilePhone 형이므로 SmartPhone 멤버에 접근할 수 없는 것이다.

        // 참조 변수의 형을 기준으로 접근 가능한 멤버를 제한하는 것은 코드를 단순하게 해준다!
    }
}


// 자식 클래스는 부모 클래스의 모든 특성을 지닌다.
// 거기에 더하여 자식 클래스는 자신만의 추가적인 특성을 더하게 된다.
// 상속의 기본조건 : IS-A 관계
// "스마트폰 IS A 모바일폰", "스마트폰도 모바일 폰이다.", "스마트폰은 일종의 모바일 폰이다."
