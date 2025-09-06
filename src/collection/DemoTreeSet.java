package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

    public static void main(String[] args) {

        Set<Integer> numbs = new TreeSet<Integer>();
        numbs.add(62);
        numbs.add(54);
        numbs.add(82);
        numbs.add(21);

        for(int n : numbs){
            System.out.println(n);
        }

        System.out.println("-------------------------------");

        Iterator<Integer> itr = numbs.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
