package stream;

import java.util.Arrays;
import java.util.List;

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

        numbs.forEach(n-> System.out.println(n));

        // now let's do the same thing using Streams



    }
}
