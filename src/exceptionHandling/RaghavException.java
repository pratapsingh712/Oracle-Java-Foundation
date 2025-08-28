package exceptionHandling;

class CustomException extends Exception {

    public CustomException(String string) {
        super(string);
    }
}

public class RaghavException {

    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try{
            if(j==0){
                throw new CustomException("Inside Custom Exception throws :");
            }
            j = i/j;
        }catch(CustomException e){
            System.out.println("Inside Catch block :"+e.getMessage());
        }
    }
}
