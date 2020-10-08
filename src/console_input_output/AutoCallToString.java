package console_input_output;

class Box{
    private String conts;

    Box(String cont){
        this.conts = cont;
    }

    public String toString(){
        return conts;
    }
}

public class AutoCallToString {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("12");
        stb.append(34);
        System.out.println(stb.toString());
        System.out.println(stb); // System.out.println은 참조값이 전달되면, 이 값의 인스턴스를 대상으로 toString 메소들을 호출한다.

        Box box = new Box("Camera");
        System.out.println(box.toString());
        System.out.println(box);
    }
}
