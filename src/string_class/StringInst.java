package string_class;

public class StringInst {

    public static void showString(String str){
        System.out.println(str);
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        String str1 = new String("Simple String");
        String str2 = "The Best String"; // 보편적으로 이와 같이 String 클래스의 인스턴스를 생성한다.

        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println();

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny String"); // 스트링 인스턴스 생성후에 메소르를 호출한다.
    }
}
