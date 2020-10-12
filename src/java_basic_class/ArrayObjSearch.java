package java_basic_class;

import java.util.Arrays;

class Person2 implements Comparable{
    private String name;
    private int age;

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o){
        Person2 p = (Person2)o;
        return this.age - p.age;
    }

    @Override
    public String toString(){
        return name + ": " + age;
    }
}

public class ArrayObjSearch {
    public static void main(String[] args) {
        Person2[] ar = new Person2[3];
        ar[0] = new Person2("Lee",29);
        ar[1] = new Person2("Goo",15);
        ar[2] = new Person2("Soo", 37);

        Arrays.sort(ar);

        int idx = Arrays.binarySearch(ar, new Person2("Who are you?",37)); // 이렇게 이진 탐색을 하려면, Comparable 인터페이스를 구현해야한다.
        System.out.println(ar[idx]);
    }
}
