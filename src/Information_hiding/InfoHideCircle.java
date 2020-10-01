package Information_hiding;

class Circle{

    // private 선언으로 정보 은닉을 한다. setRad 메서드를 통해서만 접근할 수 있게한다.
    private double rad = 0;
    final double PI = 3.14;

    public Circle(double r){
        setRad(r);
    }

    public void setRad(double r){
        if(r<0){
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getRad(){
        return rad;
    }

    public double getArea(){
        return (rad*rad) * PI; // 원의 넓이 반환
    }
}

public class InfoHideCircle {
    public static void main(String[] args) {
        Circle c = new Circle(1.5);
        System.out.println("반지름 : " + c.getRad());
        System.out.println("넓 이 : " + c.getArea() + "\n");

        c.setRad(3.4);
        System.out.println("반지름 : " + c.getRad());
        System.out.println("넓 이 : " + c.getArea());
    }
}
