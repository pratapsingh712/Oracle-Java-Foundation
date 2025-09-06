package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>{

   String name;
   int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students that) {
        return Integer.compare(this.age,that.age);
    }
}

public class DemoSortingComparable {

    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("navin",21));
        studentsList.add(new Students("pravin",18));
        studentsList.add(new Students("Hema",66));
        studentsList.add(new Students("vijay",33));
        studentsList.add(new Students("Chetan",44));

        Collections.sort(studentsList);

        for(Students stu : studentsList){
            System.out.println(stu);
        }

    }
}
