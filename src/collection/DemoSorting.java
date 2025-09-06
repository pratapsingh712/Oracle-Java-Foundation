package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoSorting {

    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10)
                return 1;
                else
                    return -1;
            }
        };

        List<Integer> numbs = new ArrayList<>();
        numbs.add(43);
        numbs.add(31);
        numbs.add(72);
        numbs.add(24);

        Collections.sort(numbs,com);

        System.out.println(numbs);
    }
}
