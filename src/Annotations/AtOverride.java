package Annotations;

import javax.swing.text.View;

interface Viewable{
    public void showIt(String str);
}

class Viewer implements Viewable{
    @Override // 상위 클래스의 메소드 오버라이딩 또는 인터페이스에 선언된 추상 메소드의 구현이다.
    public void showIt(String str){
        System.out.println(str);
    }
}

public class AtOverride {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.showIt("Hello Annotations");
    }
}
