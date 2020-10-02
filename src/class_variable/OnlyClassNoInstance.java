package class_variable;

class InstCnt2 {
    static  int instNum = 100;

    InstCnt2(){
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}

public class OnlyClassNoInstance {
    public static void main(String[] args) {
        InstCnt2.instNum -= 15; // 인스턴스 생성 없이 instNum에 접근
        System.out.println(InstCnt2.instNum);

        // InstCnt2 클래스의 인스턴스를 생성하지 않아도 클래스 변수에 접근할 수 있다.
        // 이는 클래스 변수는 인스턴스 생성 이전에 메모리 공간에 존재하기 때문이다.
        // 클래스 변수는 클래스가 JVM의 클래스 로더에 의해 읽히는 순간 메모리 공간에 할당되고 초기화 된다. 인스턴스의 생성과 무관하다.
        // 따라서 클래스 변수를 초기화할때는 생성자로 초기화 하지 않도록 주의 해야한다.

    }
}
