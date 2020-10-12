package java_basic_class;

public class UseWrapperClass {
    public static void showData(Object obj){
        System.out.println(obj); // 레퍼 클래스도 toString 메소드를 오버라이딩 하고 있다.
    }

    public static void main(String args[]){
        Integer iInst = new Integer(3);
        showData(iInst);
        showData(new Double(7.15));
    }
}
