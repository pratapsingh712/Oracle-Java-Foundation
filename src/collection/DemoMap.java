package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoMap {

    public static void main(String[] args) {

        Map<String, Integer> students = new Hashtable<>();

        students.put("Navin",43);
        students.put("John",54);
        students.put("Kiran",84);
        students.put("lena",88);
        students.put("harsh",45);

        System.out.println(students.get("Navin"));

        System.out.println(students);

        System.out.println("-------------------");

        System.out.println(students.keySet());

        System.out.println("-------------------");

        for(String name : students.keySet()){
            System.out.println(name+" , "+students.get(name));
        }

    }
}
