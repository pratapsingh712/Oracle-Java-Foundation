package exceptionHandling;

class A{
    public void show() throws ClassNotFoundException {
        Class.forName("exceptionHandling.DuckingException");
    }
}

public class DuckingException {
    static {
        System.out.println("Class Loaded:");
    }

    public static void main(String[] args) {

        A obj = new A();
        try{
            obj.show();
            System.out.println("Class Found Successfully ! ");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
