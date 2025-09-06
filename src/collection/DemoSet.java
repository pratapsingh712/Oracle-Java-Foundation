package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {

    public static void main(String[] args) {

        Set<Integer> numbs = new HashSet<Integer>();
        numbs.add(62);
        numbs.add(54);
        numbs.add(82);
        numbs.add(21);

        for(int n : numbs){
            System.out.println(n);
        }

        Iterator<Integer> value = numbs.iterator();

        while(value.hasNext()){
            System.out.println(value.next());
        }

        System.out.println("----------------------------------------");

        for(Object n : numbs){
            int num = (Integer) n;
            System.out.println(num);

        }

    }
}
