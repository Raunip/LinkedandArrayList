package ArrayList;

import javax.swing.plaf.IconUIResource;

import java.util.ArrayList;

public class ArrayListTest {
     public static void main(String[] args){
         ArrayList<String> countries = new ArrayList<String>();
         countries.add("India");
         countries.add("Italy");
         countries.add("Thailand");
         countries.add("USA");

        /* for (int i=0; i<countries.size(); i++ ){
             String country = countries.get(i);
             System.out.println(country);
         } */

        /* for(String country: countries){
             System.out.println(country);
         }*/

         System.out.println(countries);
         countries.set(1,"France");
         System.out.println(countries);
         countries.add(1,"Germany");
         System.out.println(countries);
         countries.remove(3);
         System.out.println(countries);
         System.out.println(countries.size());


     }

}
