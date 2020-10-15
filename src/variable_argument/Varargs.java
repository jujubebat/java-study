package variable_argument;

public class Varargs {
    public static void showAll(String...vargs){ // 매개변수에 가변 인자 선언을 하면 전달되는 인자의 수에 제한을 두지 않을 수 있다.
        System.out.println("LEN : " + vargs.length);

        for(String s : vargs)
            System.out.println(s + '\t');
        System.out.println();
    }

    public static void main(String[] args) {
        showAll("Box");
        showAll("Box", "Toy");
        showAll("Box", "Toy", "Apple"); // 배열로 만들어 전달한다.
    }
}
