package inheritance1;

import java.util.function.DoubleToIntFunction;

class Man{
    String name;

    public Man(String name){
        this.name = name;
    }

    public void tellyourName(){
        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man {
    String company;
    String position;

    public BusinessMan(String name, String company, String posistion){
        super(name); // 부모 클래스의 멤버는 이렇게 super 키워드를 써서 부모 클래스의 생성자로 초기화 한다.
        this.company = company;
        this.position = posistion;
    }

    public void tellyourInfo(){
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellyourName();
    }
}

public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan("YOON","Hybrid ELD", "Staff Eng.");
        man.tellyourInfo();
    }
}
