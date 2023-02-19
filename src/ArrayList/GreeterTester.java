package ArrayList;

public class GreeterTester {
    public static void main (String[] args){
        StaticmethodExample randomGreeter = StaticmethodExample.getRandomInstance();
        String randomGreeting = randomGreeter.sayHello();
        System.out.println(randomGreeting);

    }
}
