package collection_framework;

import java.util.*;

class Car3{
    protected int disp;
    public Car3(int d){
        disp = d;
    }

    @Override
    public String toString(){
        return "cc : " + disp;
    }
}

// Car의 정렬을 위한 클래스
class CarComp implements Comparator<Car3>{
    @Override
    public int compare(Car3 o1, Car3 o2){
        return o1.disp - o2.disp;
    }
}

class ECar2 extends Car3{
    private int battery;

    public ECar2(int d, int b){
        super(d);
        battery = b;
    }

    @Override
    public String toString(){
        return "cc : " + disp + ", ba : " + battery;
    }
}

public class CarComparator {
    public static void main(String[] args) {
        List<Car3> clist = new ArrayList<>();
        clist.add(new Car3(1800));
        clist.add(new Car3(1200));
        clist.add(new Car3(3000));

        List<ECar2> elist = new ArrayList<>();
        elist.add(new ECar2(3000, 55));
        elist.add(new ECar2(1800, 87));
        elist.add(new ECar2(1200, 99));

        CarComp comp = new CarComp();

        // 각각 정렬
        Collections.sort(clist, comp);
        Collections.sort(elist, comp); // 이 문장이 이 예제의 핵심!

        for(Iterator<Car3> itr = clist.iterator(); itr.hasNext();){
            System.out.println(itr.next().toString() + " ");
        }
        System.out.println();

        for(Iterator<ECar2> itr = elist.iterator(); itr.hasNext();)
            System.out.println(itr.next().toString() + " ");

    }
}
