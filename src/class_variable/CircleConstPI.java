package class_variable;

class Circle{

    // 변하지 않는, 참조가 목적인 값. 클래스 변수인 상수 변수다.
    // 이와 같이 인스턴스 각각이 지녀야 하지 않아도 되고
    // 참조를 목적으로만 조재하는 값은 final 선언이 된 클래스 변수에 담는다.
    static final double PI = 3.1415;
    private double radius;

    Circle(double rad){
        radius = rad;
    }

    void showPerimeter(){
        double peri = (radius * 2) * PI;
        System.out.println("둘레 : " +  peri);
    }

    void showArea(){
        double area = (radius * radius) * PI;
        System.out.println("넓이 : " + area);
    }
}

public class CircleConstPI {
    public static void main(String[] args) {
        Circle c = new Circle(1.2);
        c.showPerimeter();
        c.showArea();
    }
}
