package Annotations;

import javax.swing.text.View;

interface Viewable2 {
    @Deprecated // 호환성 유지를 위해 존재하지만 이후에 사라질 수 있는 클래스 또는 메소드를 가리켜 Deprecated 되었다고 한다.
    // @SuppressWarnings("deprecation") // @SuppressWarnings 선언을 통해 deprecation 경고를 지울 수 있다. 
    public void showIt(String str); // Deprecated 된 메소드

    public void brShowIt(String str);
}

class Viewer2 implements Viewable2 {
    @Override
    public void showIt(String str){
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str){
        System.out.println('[' + str + ']');
    }
}

public class AtDeprecated {
    // @SuppressWarnings("deprecation") // @SuppressWarnings 선언을 통해 deprecation 경고를 지울 수 있다.
    public static void main(String[] args) {
        Viewable2 view = new Viewer2();
        view.showIt("Hello Annotations"); // 컴파일러가 Deprecated된 showIt 메소드에 대해 경고하고 있다.
        view.brShowIt("Hello Annotations");
    }
}
