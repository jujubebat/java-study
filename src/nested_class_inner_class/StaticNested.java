package nested_class_inner_class;

class Outer{
    private static int num = 0;

    static class Nested1 { // Static 네스티드 클래스
        void add(int n){
            num += n;
        }
    }

    static class Nested2 { // Static 네스티드 클래스
        int get(){
            return num;
        }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1 = new Outer.Nested1();
        nst1.add(5);
        Outer.Nested2 nst2 = new Outer.Nested2();
        System.out.println(nst2.get());
    }
}

// 외부 클래스의 인스턴스 생성 않고도 Static 네스티드 클래스의 인스턴스 생성이 가능하다.
// Static 네스티드 클래스 내에서 외부 클래스의 인스턴스 변수와 메소드에 접근 불가능하다.
// 즉 Static 네스티드 클래스 내에서는 외부 클래스에 static으로 선언된 변수와 메소드에만 접근이 가능하다.