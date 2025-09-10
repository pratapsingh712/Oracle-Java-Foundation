package stream;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin","Lakshmi","John","Kishore");

        List<String> uNames = names.stream()
//                .map(name-> name.toUpperCase())
                .map(String::toUpperCase)
                .toList();

        uNames.forEach(System.out::println);
    }
}
