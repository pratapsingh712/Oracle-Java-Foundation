package exceptionHandling;

public class Demo {
    public static void main(String[] args) {
        int i = 0;
        int j = 5;

        int result = 0;

        try{
            result = j/i; // need to initialize something to variable result because if something goes wrong then result will never be assigned a value.
        }catch(Exception e){
            System.out.println("Can not divide by zero :");
        }

        System.out.println("Result values is = "+result);
    }
}
