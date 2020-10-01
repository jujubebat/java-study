package Information_hiding.animal;

import Information_hiding.zoo.Cat;
// import Information_hiding_and_encapsulation.zoo.Duck;

public class Dog {
    public void makeCat(){
        // Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성가능
        Cat yang = new Cat();
    }

    public void makeDuck(){
        // Duck 클래스는 default로 선언되었으므로 이 위치에서 인스턴스 생성불가.
       // Duck quack = new Duck();
    }
}
