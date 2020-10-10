package object_class;

class Point implements Cloneable{
    private int xPos;
    private int yPos;

    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void showPosition(){
        System.out.printf("[%d %d]",xPos,yPos);
        System.out.println();
    }

    // 원래 Object 클래스의 clone 메서드는 반환형이 protected다.
    // 하지만 이렇게 오버라이딩을 통해 public으로 바꾸는 것이 가능하다.
    // 즉, 오버라이딩을 통해 접근 범위를 확대할 수 있다. 하지만 반대로 접근 범위를 줄이는 것은 불가능하다.
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class InstanceCloning {
    public static void main(String[] args) {
        Point org = new Point(3,5);
        Point cpy;

        try{
            cpy = (Point)org.clone();
            org.showPosition();
            cpy.showPosition();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
