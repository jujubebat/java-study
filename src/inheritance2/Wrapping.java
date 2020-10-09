package inheritance2;

class Box{
    public void simpleWrap(){
        System.out.println("Simple Wrapping");
    }
}

class PaperBox extends Box{
    public void paperWrap(){
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox{
    public void goldWrap(){
        System.out.println("Gold Wrapping");
    }
}

class SilverPaperBox extends PaperBox{
    public void goldWrap(){
        System.out.println("Silver Wrapping");
    }
}

public class Wrapping {
    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();
        SilverPaperBox box4 = new SilverPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
        wrapBox(box4);
    }
    public static void wrapBox(Box box){
        // instanceof 연산자는 참조변수가 참조하는 인스턴스의 '클래스'나
        // 참조하는 인스턴스가 '상속하는 클래스'를 묻는 연산자다.
        // 따라서 연산자 instanceof는 명시적 형 변환의 가능성을 파단해주는 연산자다.
        if(box instanceof GoldPaperBox){
            ((GoldPaperBox)box).goldWrap();
        }
        else if(box instanceof PaperBox){ // box가 참조하는 인스턴스가 PaperBox 인스턴스거나 PaperBox를 상속하는 인스턴스일경우.
            ((PaperBox)box).paperWrap(); // Box 타입의 참조 변수인 box를 PaperBox 타입 참조 변수로 명시적 형변환을 하여, PaperBox의 메서드를 호출한다.
        }else{
            box.simpleWrap();
        }
    }
}
