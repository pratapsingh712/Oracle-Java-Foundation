package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        int size = 10_000;

        List<Integer> numbs = new ArrayList<>(size);

        Random ran = new Random();

        for(int i=1;i<=size;i++){
            numbs.add(ran.nextInt(100));
        }

        int sum = numbs.stream()
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);

        long startSeq = System.currentTimeMillis();

        int sum2 = numbs.stream()
                        .map(i->i*2)
                                .mapToInt(i->i)
                                        .sum();

        long endSeq = System.currentTimeMillis();


        long startParallel = System.currentTimeMillis();

        int sum3 = numbs.parallelStream()
                        .map(i->i*2)
                                .mapToInt(i->i)
                                        .sum();

        long endParallel = System.currentTimeMillis();

        System.out.println(sum2+" , and "+sum3);
        System.out.println("Seq:"+(endSeq-startSeq));
        System.out.println("Para:"+(endParallel-startParallel));
    }
}
