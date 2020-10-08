package array;

public class ArrayIsInstance {
    public static void main(String[] args) {
        // 길이가 5인 int형 1차원 배열의 생성
        int[] ar1 = new int[5];

        // 자바에서 배열은 인스턴스다!! int[]은 정수형 배열 인스턴스를 가리키는 참조변수다. new int[5]를 하면 길이 5의 정수형 인스턴스가 만들어진다.

        // 길이가 7인 double형 1차원 배열의 생성
        double[] ar2 = new double[7];

        // 배열의 참조변수와 인스턴스 생성 분리
        float[] ar3;
        ar3 = new float[9];

        // 배열의 인스턴스 변수 접근
        System.out.println("배열 ar1 길이 : " + ar1.length); // 배열 인스턴스의 length 멤버에 접근하는 것을 볼 수 있다.
        System.out.println("배열 ar2 길이 : " + ar2.length);
        System.out.println("배열 ar3 길이 : " + ar3.length);

    }
}
