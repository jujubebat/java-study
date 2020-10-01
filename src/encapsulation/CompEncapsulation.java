package encapsulation;

class SinivelCap3{ // 콧물 처지용 캡슐
    void take(){
        System.out.println("콧물이 싹~ 납니다.");
    }
}

class SneezeCap3{ // 재채기 처치용 캡슐
    void take(){
        System.out.println("재채기가 멎습니다.");
    }
}

class SnuffleCap3{ // 코막힘 처지용 캡슐
    void take(){
        System.out.println("코가 뻥 뚫립니다.");
    }
}

class SinusCap3 {
    SinivelCap3 siCap = new SinivelCap3(); // 한 클래스가 다른 클래스의 인스턴스를 멤버로 가질 수 있다. 이러한 관계를 포함관계라고 한다.
    SneezeCap3 szCap = new SneezeCap3();  // 포함관계는 캡슐화를 완성하는 과정에서도 사용이된다.
    SnuffleCap3 sfCap = new SnuffleCap3();

    void take(){
        siCap.take();
        szCap.take();
        sfCap.take();
    }
}

class ColdPatient3{
    void takeSinus(SinusCap3 cap){
        cap.take();
    }
}

public class CompEncapsulation {
    public static void main(String[] args) {
        ColdPatient3 suf = new ColdPatient3();
        suf.takeSinus(new SinusCap3());
    }
}
