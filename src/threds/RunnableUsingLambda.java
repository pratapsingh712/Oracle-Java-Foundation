package threds;

public class RunnableUsingLambda {

    public static void main(String[] args) {

        Runnable obj = () ->{
          for(int i=0;i<5;i++){
              System.out.println("Hello:");
          }
        };

        Runnable obj1 = () ->{
            for(int i=0;i<5;i++){
                System.out.println("Hello Raghav:");
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}
