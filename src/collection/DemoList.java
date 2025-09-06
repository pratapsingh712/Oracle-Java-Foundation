package collection;

import java.util.*;

public class DemoList {

    public static void main(String[] args) {

        Collection<Integer> numbs = new ArrayList<Integer>();
        numbs.add(5);
        numbs.add(3);
        numbs.add(6);
        numbs.add(9);

        System.out.println(numbs);
        System.out.println("--------------------------------");

        for(Integer n : numbs){
            System.out.println(n);
        }
    }
}
