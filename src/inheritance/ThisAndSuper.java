package inheritance;

class A{
    public A(){
        System.out.println("Inside A class constructor: ");
    }

    public A(int a){
        System.out.println("Inside int A: ");
    }
}

class B extends A {

    public B() {
        super(5);
        System.out.println("Inside B class constructor :");
    }

    public B(int a){
        super(5);
        System.out.println("Inside int B: ");
    }
}

public class ThisAndSuper {

    public static void main(String[] args) {

        B obj = new B(); // inside A class

        System.out.println("----------------------------------------->");

        B objB = new B(5);
    }
}
