package string_class;

public class ImmutableString {
    public static void main(String[] args) {
        String str1 = "Simple String";
        String str2 = "Simple String"; // str1의 인스턴스와 동일한 내용을 가지므로 str1 인스턴스를 공유한다.(이로인해 생성되는 인스턴스의 수는 줄고 성능은 향상된다.)
        // 위와 같이 하나의 인스턴스를 공유해도 문제가 되지 않는다. 왜냐면 String 인스턴스는 불변 객체이기 때문이다.
        // 즉, String 인스턴스는 그 안에 저장된 데이터를 수정할 수 없는 참조만 가능한 인스턴스이기 때문이다.
        // ( 참고 : 만약 String 인스턴스가 수정되면 새로운 String 인스턴스가 생성된다. )

        String str3 = new String("Simple String");
        String str4 = new String("Simple String");

        if(str1 == str2)
            System.out.println("str1과 str2는 동일 인스턴스 참조");
        else
            System.out.println("str1과 str2는 다른 인스턴스 참조");

        if(str3 == str4)
            System.out.println("str3과 str4는 동일 인스턴스 참조");
        else
            System.out.println("str3과 str4는 다른 인스턴스 참조");
    }
}
