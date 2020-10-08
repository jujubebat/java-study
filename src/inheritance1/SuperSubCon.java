package inheritance1;

class SuperCLS{
    public SuperCLS(){
        System.out.println("Con : SuperCLS()");
    }

    public SuperCLS(int i){
        System.out.println("Con : SuperCLS(int i)");
    }

    public SuperCLS(int i, int j){
        System.out.println("Con : SuperCLS(int i, int j)");
    }
}

class SubCLS extends SuperCLS{
    public SubCLS(){ // super 키워드가 없으면 자동으로 부모 클래스 생성자를 호출한뒤 자식 클래스 생성자가 호출된다.
        //  super(); // 이렇게 자동으로 부모 클래스 생성자 호출문이 삽입된다.
        System.out.println("Con : SubCLS()");
    }

    public SubCLS(int i){
        super(i); // super 키워드를 통해 부모 클래스의 생성자를 명시적으로 호출한다. (생성자 바로 다음줄에 super가 와야한다!)
        System.out.println("Con : SubCLS(int i)");
    }

    public SubCLS(int i, int j){
        super(i, j); // super 키워드를 통해 부모 클래스의 생성자를 명시적으로 호출한다. (생성자 바로 다음줄에 super가 와야한다!)
        System.out.println("Con : SubCLS(int i, int j)");
    }
}

public class SuperSubCon {
    public static void main(String[] args) {
        System.out.println("1. ");
        new SubCLS();
        System.out.println();

        System.out.println("2. ");
        new SubCLS(1);
        System.out.println();

        System.out.println("3. ");
        new SubCLS(1,2);
        System.out.println();

    }
}
