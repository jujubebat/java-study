package collection_framework;

import java.util.HashSet;
import java.util.Objects;

class Car{
    private String model;
    private String color;

    public Car(String m, String c){
        model = m;
        color = c;
    }

    @Override
    public String toString(){
        return model + " : " + color;
    }

    // HashSet<E>이 두 인스턴스가 같은지 판단하는 방법은
    // 인스턴스에 정의되어 있는 equals 메소드와 hashCode 메소드의 호출결과를 근거로 한다.
    // 따라서 두 메소드를 오버라이딩 해야한다.

    // Object 클래스의 hashCode와 equals는 저장하고 있는 값을 기준으로 인스턴스의 동등 여부를 따지지 않는다.
    // Objcet 클래스에 정의되어 있는 hashCode와 equals 메소드는 다음과 같이 정의되어 있다.
    // 인스턴스가 다르면 Object 클래스의 hashCode 메소드는 다른 값을 반환한다. (주소 값을 기준으로 반환값이 만들어진다.)
    // 인스턴스가 다르면 Object 클래스의 equals 메소드는 false를 반환한다.
    // 따라서 아래와 같이 내용을 기준으로 동등 비교를 하도록 오버라이딩 해줘야한다.
    // 참고로 String 클래스의 hashCode와 equals는 인스턴스의 내용을 비교하도록 적절히 오버라이딩이 되어있다.
    // 따라서 아래와 같이 작성하면 된다.

    @Override
    public int hashCode(){
        return (model.hashCode() + color.hashCode()) / 2;
        // return Objects.hash(model, color); // 이렇게도 할 수 있다. hash 메소드는 하나 이상의 매개변수를 조합하여 하나의 해쉬 값을 만들어 반환한다.
    }

    @Override
    public boolean equals(Object obj){
        String m = ((Car)obj).model;
        String c = ((Car)obj).color;

        if(model.equals(m) && color.equals(c))
            return true;
        else
            return false;
    }
}

public class HowHashCode {
    public static void main(String[] args) {
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("HY_MD_301", "RED"));
        set.add(new Car("HY_MD_301", "BLACK"));
        set.add(new Car("HY_MD_302", "RED"));
        set.add(new Car("HY_MD_302", "WHITE"));
        set.add(new Car("HY_MD_301","BLACK"));
        System.out.println("인스턴스 수 : " + set.size());

        for(Car car : set)
            System.out.println(car.toString() + '\t');
    }
}
