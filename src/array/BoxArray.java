package array;

class Box2{
    private String conts;

    Box2(String cont){
        this.conts = cont;
    }

    public String toString(){
        return conts;
    }
}

public class BoxArray {
    public static void main(String[] args) {
        Box2[] ar = new Box2[3];

        // 배열에 인스턴스 저장
        ar[0] = new Box2("First");
        ar[1] = new Box2("Second");
        ar[2] = new Box2("Third");

        // 저장된 인스턴스의 참조
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);

    }
}
