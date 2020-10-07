package method_overloading;

class SimpleBox{
    private int data;

    SimpleBox(int data){
        this.data = data; // 왼쪽의 this가 의미하는 것은 '이 문장이 속한 인스턴스'이다.
    }

    void setData(int data){
        this.data = data;
    }

    int getData(){
        return this.data;
    }
}

public class ThisInst {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(99);
        System.out.println(box.getData());

        box.setData(77);
        System.out.println(box.getData());
    }
}
