package String;
import java.util.Scanner;
public class stringTester {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How old are you");
        int age = in.nextInt();
        System.out.println("Next year you will be "+(age+1)+ " years old");
    }
}
