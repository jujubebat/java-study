package collection_framework;

import java.util.*;

class Car2 implements Comparable<Car2>{
    protected int disp; // 배기량

    public Car2(int d) {disp = d;}

    @Override
    public String toString(){
        return "cc : " + disp;
    }

    @Override
    public int compareTo(Car2 o){
        return disp - o.disp;
    }
}

class ECar extends Car2 {
    private int battery;

    public ECar(int d, int b){
        super(d);
        battery = b;
    }

    @Override
    public String toString(){
        return "cc : " + disp + ", ba : " + battery;
    }
}

public class ECarSortCollections {
    public static void main(String[] args) {
        List<ECar> list = new ArrayList<>();
        list.add(new ECar(1200,99));
        list.add(new ECar(1300,55));
        list.add(new ECar(1800,87));
        Collections.sort(list); // 정렬

        for(Iterator<ECar> itr = list.iterator(); itr.hasNext();)
            System.out.println(itr.next() + " ");
    }
}
