package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student(){

    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ConstructorReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin","Lakshmi","John","Kishore");


        List<Student> studentList = new ArrayList<>();

//        for(String name: names){
//            studentList.add(new Student(name));
//        }

        studentList = names.stream()
//                        .map(name->new Student(name))// we can also use constructor reference
                .map(Student::new)
                .toList();


        System.out.println(studentList);
    }
}
