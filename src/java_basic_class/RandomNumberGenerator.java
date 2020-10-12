package java_basic_class;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random(12); // 씨드값을 12로 주었다. 난수 생성 알고리즘은 씨드값 기준으로 돌아간다. 따라서 항상 난수의 패턴이 똑같다.

        for(int i=0; i<7; i++)
            System.out.println(rand.nextInt(1000)); // 0이상 1000 미만 난수 생성

        System.out.println();

        Random realRand = new Random(System.currentTimeMillis()); // new Random(); 이렇게 해줘도 된다. 기본 생성자에서 this(System.currentTimeMillis())을 호출하기 때문이다.

        for(int i=0; i<7; i++)
            System.out.println(realRand.nextInt(1000));
    }
}
