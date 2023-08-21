import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsStudy01 {

    public static void main(String[] args) {

        // sort

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5));

        Collections.sort(numbers);
        
        System.out.println(numbers); // [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9]
    

        
    
    }
    
}
