package object_class;

class INum{
    private int num;

    public INum(int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj){
        if(this.num == ((INum)obj).num)
            return true;
        else
            return false;
    }
}

public class ObjectEquality {
    public static void main(String[] args) {
        INum num1 = new INum(10);
        INum num2 = new INum(12);
        INum num3 = new INum(10);

        if(num1.equals(num2))
            System.out.println("num1, num2 내용 동일하다.");
        else
            System.out.println("num1, num2 내용 다르다.");

        if(num1.equals(num3))
            System.out.println("num1, num3 내용 동일하다.");
        else
            System.out.println("num1, num2 내용 다르다.");

        // INum 클래스의 인스턴스 변수 num을 기준으로 인스턴스를 비교했다.
        // 이렇듯 두 인스턴스의 내용 비교 결과 반환조건은 해당 클래스를 정의하는 프로그래머가 결정 해야한다.
        // 그리고 그 결정 사항을 equals 메소드의 오버라이딩을 통해서 반영해야 한다.
        // Object 클래스의 equals 메소드는 내용 비교가 이뤄지도록 오버라이딩 하라고 존재하는 메소드다.
    }
}
