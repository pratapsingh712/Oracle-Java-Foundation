package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin","Lakshmi","John","Kishore");

        String name = names.stream()
                .filter(nam -> nam.contains("x"))
                .findFirst()// this could give null value
                .orElse("Not Found:");

        System.out.println(name);

    }
}
