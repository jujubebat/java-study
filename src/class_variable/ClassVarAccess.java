package class_variable;

class AccessWay {
    static int num = 0; // default로 선언되어있으므로 클래스 내부와 동일 패키지 내에서 접근 가능하다. (메인에서 접근 가능한 것을 볼 수 있음)

    AccessWay(){
        incrCnt();
    }

    void incrCnt(){
        num++; // 클래스 내부에서 이름을 통한 접근
    }
}

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay way = new AccessWay();

        // 클래스 변수에 접근하는 2가지 방법을 알아보자.

        way.num++; // 외부에서 인스턴스의 이름을 통한 접근
        AccessWay.num++; // 외부에서 클래스의 이름을 통한 접근

        System.out.println("num = " + AccessWay.num);
    }
}
