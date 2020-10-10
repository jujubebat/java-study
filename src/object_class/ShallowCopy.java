package object_class;

class Point2 implements Cloneable{
    private int xPos;
    private int yPos;

    public Point2(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void showPosition(){
        System.out.printf("[%d %d]", xPos, yPos);
        System.out.println();;
    }

    public void changePos(int x, int y){
        xPos = x;
        yPos = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Rectangle implements Cloneable{
    private Point2 upperLeft; // 좌측 상단 좌표
    private Point2 lowerRight; // 우측 하단 좌표

    public Rectangle(int x1, int y1, int x2, int y2){
        upperLeft = new Point2(x1,y1);
        lowerRight = new Point2(x2,y2);
    }

    public void changePos(int x1, int y1, int x2, int y2){
        upperLeft.changePos(x1,y1);
        lowerRight.changePos(x2,y2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void showPosition(){
        System.out.print("좌측 상단 : ");
        upperLeft.showPosition();

        System.out.print("우측 하단 : ");
        lowerRight.showPosition();
    }
}


public class ShallowCopy {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1,1,9,9);
        Rectangle cpy;

        try{
            cpy = (Rectangle)org.clone(); // Rectangle 클래스의 Point2 참조변수에 대해서 복사가 일어나지 않는다.(얕은 복사)
            org.changePos(2,2,7,7); // 즉 org와 cpy 둘다 같은 Point2 참조 변수 2개를 지니고 있는 것이다.
            org.showPosition();
            cpy.showPosition();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
