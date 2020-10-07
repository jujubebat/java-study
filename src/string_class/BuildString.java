package string_class;

public class BuildString {
    public static void main(String[] args) {
        // 문자열 "123"이 저장된 인스턴스의 생성
        StringBuilder stbuf = new StringBuilder("123");

        // StringBuilder 클래스는 내부적으로 문자열을 저장하기 위한 메모리 공간을 지닌다.
        // 그리고 String 클래스의 메모리 공간과 다르게 문자를 추가하거나 삭제하는 것이 가능하다.
        // StringBuilder 클래스는 쓰레드 세이프하지 않다. 따라서 속도가 빠르다.
        // 반면 StringBuffer 클래스는 쓰레드에 안전하다. 따라서 느리다.

        stbuf.append(45678); // 문자열 덧붙이기
        System.out.println(stbuf.toString());

        stbuf.delete(0,2); // 인덱스 0부터 2까지 삭제
        System.out.println(stbuf.toString());

        stbuf.replace(0,3,"AB"); // 0부터 3이전까지를 "AB"로 대체
        System.out.println(stbuf);

        stbuf.reverse(); // 문자열 내용 뒤집기
        System.out.println(stbuf.toString());

        String sub = stbuf.substring(2,4); // 2부터 4이전까지 자른다.
        System.out.println(sub);
    }
}
