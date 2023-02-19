package ArrayList;

import java.util.*;

public class ArraysTest {
    public static void main (String[] args){
        /*double[] mylist = new double[10];
        Random r = new Random();
        for (int i=0; i<10; i++)
        {
            mylist[i]=r.nextDouble();
        }

        for(double db:mylist){
            System.out.println(db);
        }

        // int [][] table = new int[10][20]; // 2D array

       // Array list from/to Array   */

        String[] array ={"red","blue","green","yellow","apple"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        //Creating an array of an object  from an ArrayLsit

        String[] array1 = new String[list.size()];
        list.toArray(array1);

        //Max and Min
        System.out.println(java.util.Collections.min(new ArrayList<String>(Arrays.asList(array))));
        System.out.println(java.util.Collections.max(new ArrayList<String>(Arrays.asList(array))));


        // Shuffle

        Integer[] array2 = {3,5,6,7,8,9,6,4};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(array2));
        Collections.shuffle(list3);
        System.out.println(list3);

    }
}
