package exceptionHandling;

public class ThrowsKeyword {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;


        try{
            if(j==0){
                throw new ArithmeticException("I don't want to print the Error :");
                }
            j = i/j; // perform only when j!=0
        }catch(ArithmeticException e){
            System.out.println("The default value is "+e.getMessage());
        }
    }
}
