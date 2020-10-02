package class_variable;

class InstCnt {
    // 클래스 내에 선언된 변수에 static을 선언하면 클래스 변수다.
    // 클래스 변수는 클래스의 인스턴스가 공유하는 변수다.
    // 어떠한 인스턴스에도 속하지 않는 상태로 메모리 공간에 딱 하나만 존재하는 변수다.
    static int instNum = 0;

    InstCnt(){ // 생성자
        instNum++; // 클래스 변수 값 증가
        System.out.println("인스턴스 생성 : " + instNum);
    }
}

public class ClassVar {

    public static void main(String[] args) {
        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();
    }

}
