package java_basic_class;

import java.util.Arrays;

class INum{
    private int num;

    public INum(int num){
        this.num = num;
    }

    // Object 클래스의 equals 함수는 원래 참조 값만 비교한다.
    // equals 를 사용해서 인스턴스끼리 내용을 기준으로 비교하고자 하면
    // 아래와 같이 내용을 비교하도록 오버라이딩 해야한다.
    // 자바에서 제공하는 표준클래스의 경우 equals 메소드가 내용 비교를 하도록 이미 오버라이딩 되어있다.
    // 즉, Object 클래스의 equals 메소드는 내용 비교가 이뤄지도록 오버라이딩 하라고 존재하는 메소드다.
    @Override
    public boolean equals(Object obj){
        if(this.num == ((INum)obj).num)
            return true;
        else
            return false;
    }
}

public class ArrayObjEquals {
    public static void main(String[] args) {
        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];

        ar1[0] = new INum(1); ar2[0] = new INum(1);
        ar1[1] = new INum(2); ar2[1] = new INum(2);
        ar1[2] = new INum(3); ar2[2] = new INum(3);

        System.out.println(Arrays.equals(ar1,ar2));
    }
}
