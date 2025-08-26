package functionalInterface;

@FunctionalInterface
interface B{
    int add(int i, int j);
}

public class ReturningValue {

    public static void main(String[] args) {

//        B obj = new B()
//        {
//            public  int add(int i, int j){
//                return i+j;
//            }
//        };

        B obj = (int i, int j) -> {
            return i + j;
        };

        int result = obj.add(5,4);

        System.out.println(result);

    }
}
