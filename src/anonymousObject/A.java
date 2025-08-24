package anonymousObject;

public class A {

    public A(){
        System.out.println("Object created:");
    }

    public void show(){
        System.out.println("In Show :");
    }

    public static void main(String[] args) {
        new A().show();
    }
}
