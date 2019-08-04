package Collections;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Collections collections;
        //Arrays arrays;
    }
}
