package strings;

public class StringConstantPool {

    public static void main(String[] args) {
        // In this class let's define two couple of variables that will store String value by using
        // 1. String Literals
        // 2. using new keyword

        String str1 = "Hello";
        String str2 = "Hello";

        // as both the string are the same they will be referenced to a single address where the first Hello is stored and that's
        // string pool constant pool inside HEAP -> Method -> Constant pool in JVM where if there are two objects with same value are being created
        // instead of created another object and wasting memory it just refers to the first one

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));


        // now let's try and create another string with same value but with new keyword

        String str3 = new String("Hello");

        // now let's compare this with any of the above strings

        System.out.println(str1==str3);

        System.out.println(str1.equals(str3));
    }
}
