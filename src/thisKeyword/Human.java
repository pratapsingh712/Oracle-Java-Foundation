package thisKeyword;

public class Human {

    private int age;
    private String name;

    public void setAge(int age,Human obj){
        Human obj1 = obj;
        obj1.age = age;
    }

    public void setName(String name, Human obj){
        Human obj1 = obj;
        obj1.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){

        Human obj = new Human();
        obj.setAge(30,obj); // basically I am passing the object also in this method which has the reference of where age is set to 30
        obj.setName("Raghav",obj);

        System.out.println("Name :"+obj.getName()+"\nAge: "+obj.getAge());
    }

}
