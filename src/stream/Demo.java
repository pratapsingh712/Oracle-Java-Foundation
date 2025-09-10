package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        List<Integer> numbs = Arrays.asList(4,5,7,2);


        int sum = 0;

        for(int n : numbs){
            if(n%2!=0){
                n = n*2;
                sum = sum+n;
            }
        }

        System.out.println(sum);

        System.out.println("----------------------------------");

        // now let's do it using foreach

       // numbs.forEach(n-> System.out.println(n));

        // let's see how forEach works

//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };

        //Consumer<Integer> con = (Integer integer) -> System.out.println(integer);

//        Consumer<Integer> con = integer -> System.out.println(integer);
//
//
//        numbs.forEach(con);

        numbs.forEach(integer -> System.out.println(integer));

        // now let's do the same thing using Streams

        System.out.println("-------------------------------------------");

        //Stream<Integer> s1 = numbs.stream();

//        s1.forEach(n-> System.out.println(n));

//        Stream<Integer> s2 = s1.filter(n->n%2!=0);
//        Stream<Integer> s3 = s2.map(n-> n*2 );
//        int result = s3.reduce(0,(c,e)-> c+e);

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
//                if(integer%2!=0)
//                    return true;
//                else
//                    return false;
                return n%2!=0; // and now we can also use lambda expression as predicate is a functional interface
            }
        };

        Function<Integer,Integer> fun = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        int result = numbs.stream()
                        .filter(n->n%2!=0)
                        .map(fun)
                        .reduce(0,(c,e)->c+e); // c and e are the carry and the element

        System.out.println(result);


    }
}
