import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsStudy02 {

    public static void main(String[] args) {
        
        // search and modifying
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        int index = Collections.binarySearch(fruits, "banana");

        System.out.println("Index of banana : " + index);

        Collections.replaceAll(fruits, "banana", "pear");

        System.out.println(fruits);


    }

}
