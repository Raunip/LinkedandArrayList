package ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListTest {
    public static void main (String[] args){
        LinkedList<String> countries = new LinkedList<>();

        countries.add("Belgium");
        countries.add("Thailand");
        countries.add ("USA");

       // System.out.println(countries);

        ListIterator<String> iterator = countries.listIterator();

        /*while(iterator.hasNext()){
            String country = iterator.next();
            System.out.println(country);
        }*/

        iterator.next();
        //iterator.next();
        iterator.remove();
        iterator.next();
        iterator.remove();
        while(iterator.hasNext()){
            String country = iterator.next();
            System.out.println(country);
        }

    }
}
