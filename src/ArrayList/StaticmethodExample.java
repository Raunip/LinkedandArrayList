package ArrayList;

import java.util.Random;

public class StaticmethodExample {

    private String name;
    private static Random generator = new Random();

    public  StaticmethodExample (String aName) {
        name = aName;
    }

    public  static StaticmethodExample getRandomInstance(){
        if(generator.nextBoolean()){
            return new StaticmethodExample("Venus");
        }
        else {
            return new StaticmethodExample("Mars");
        }
    }

    public String sayHello(){
        return "hello, "+name +"!";
    }
}
