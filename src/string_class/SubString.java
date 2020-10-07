package string_class;

public class SubString {
    public static void main(String[] args) {
        String st1 = "abcdefg";
        String st2 = st1.substring(2); // 인덱스 2부터 맨뒤까지 자르기
        System.out.println(st2);

        String st3 = st1.substring(2,4); // 인덱스 2부터 4전까지 자르기
        System.out.println(st3);
    }
}
