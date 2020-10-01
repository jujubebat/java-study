package encapsulation;

class SinusCap2{
    void sniTake(){
        System.out.println("콧물이 싹~ 납니다.");
    }

    void sneTake(){
        System.out.println("재채기가 멎습니다.");
    }

    void snuTake(){
        System.out.println("코가 뻥 뚫립니다.");
    }

    void take(){
        sniTake();
        sneTake();
        snuTake();
    }
}

class ColdPatient2{
    void takeSinus(SinusCap2 cap){
        cap.take();
    }
}

public class OneClassEncapsulation {
    public static void main(String[] args) {
        ColdPatient2 suf = new ColdPatient2();
        suf.takeSinus(new SinusCap2());
        // SinusCap 클래스 안에 감기약 복용과 관련된 모든 내용이 캡슐화 되었다.
        // 코드가 간단해졌음을 관찰할 수 있다.
    }
}

