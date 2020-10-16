package method_rederences;

import java.util.function.ToIntBiFunction;

class IBox{
    private int n;
    public IBox(int i){
        n = i;
    }
    public int larger(IBox b){
        if(n > b.n)
            return n;
        else
            return b.n;
    }
}

public class NoObjectMethodRef {
    public static void main(String[] args) {
        IBox ib1 = new IBox(5);
        IBox ib2 = new IBox(7);

        // 두 상자에 저장된 값 비교하여 더 큰 값 반환
        // ToIntBiFunction<T, U> 인터페이스의 추상 메서드 : int applyAsInt(T t, U u)
        // ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2); // 람다식
        ToIntBiFunction<IBox, IBox> bf = IBox::larger; // 클래스 이름을 통한 인스턴스 메소드 참조 방식(이렇게 람다식을 생략할 수 있다.)
        // 익숙해져야 이러한 생략이 매우 편하게 다가온다.

        int bigNum = bf.applyAsInt(ib1, ib2);
        System.out.println(bigNum);
    }
}
