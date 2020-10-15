
package java_enum;

import com.sun.deploy.perf.PerfRollup;

enum Person4{
    MAN(29), WOMAN(25); // 열거형 값은 인스턴스다. 생성자에 인자를 전달하는 것을 볼 수 있다.

    int age;

    private Person4(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "I am " + age + " years old";
    }
}

public class EnumParamConstructor {
    public static void main(String[] args) {
        System.out.println(Person4.MAN);
        System.out.println(Person4.WOMAN);
    }
}
