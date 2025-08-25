package functionalInterface;

@FunctionalInterface
interface A{
    void show();
}

public class Demo  {

    public static void main(String[] args) {

        //A obj = new A(); can not create object of interface

        A obj = new A(){
            public void show(){
                System.out.println("Inside show method :");
            }
        };

        obj.show();
    }
}
