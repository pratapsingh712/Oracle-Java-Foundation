package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String[] args) throws IOException {

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}
