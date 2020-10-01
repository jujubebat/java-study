package encapsulation;

class SinivelCap1{ // 콧물 처지용 캡슐
    void take(){
        System.out.println("콧물이 싹~ 납니다.");
    }
}

class SneezeCap1{ // 재채기 처치용 캡슐
    void take(){
        System.out.println("재채기가 멎습니다.");
    }
}

class SnuffleCap1{ // 코막힘 처지용 캡슐
    void take(){
        System.out.println("코가 뻥 뚫립니다.");
    }
}

class ColdPatient1 {
    void takeSinivelCap(SinivelCap1 cap){
        cap.take();
    }

    void takeSneezeCap(SneezeCap1 cap){
        cap.take();
    }

    void takeSnuffleCap(SnuffleCap1 cap){
        cap.take();
    }
}

public class BadEncapsulation{
    public static void main(String[] args) {
        ColdPatient1 suf = new ColdPatient1();

        // 콧물 캡슐 구매 후 복용
        suf.takeSinivelCap(new SinivelCap1());

        // 재채기 캡슐 구매 후 복용
        suf.takeSneezeCap(new SneezeCap1());

        // 코막힘 캡슐 구매 후 복용
        suf.takeSnuffleCap(new SnuffleCap1());

        // 프로그래머는 감기를 낫기 위해 3개의 인터스를 생성해야한다.
        // 그리고 만약 약을 특정 순서대로 복용해야할 경우 프로그래머가 해야할 일과 코드가 번잡해진다.
    }
}