package equalsAndHashMethod;

import java.util.Objects;

class A{

    private int price;
    private String model;

    public A(int price, String model){
        this.price = price;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return price == a.price && Objects.equals(model, a.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model);
    }

    // implement hashcode and equals here so it does not go to the parent class OBJECT implementation for equals and hashcode

//    public boolean equals(A that){
//        return this.price==that.price && this.model.equals(that.model);
//
//        // this method is called using obj.equals so obj becomes this -> instance
//    }

    public String toString(){
        return "Model :"+model+" price :"+price;
    }
}

public class EqualsAndHashCode {

    public static void main(String[] args) {

        A obj = new A(1234,"Lenovo");

        A obj1 = new A(1234,"Lenovo");

        // if you look closely both the objects have same value :

        System.out.println(obj1.toString());
        System.out.println(obj.toString());

        // but if you try to print where they are equals or if there hashcode is same or not :

        System.out.println(obj.hashCode()==obj1.hashCode());
        System.out.println(obj.equals(obj1));
    }
}
