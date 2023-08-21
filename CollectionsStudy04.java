import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsStudy04 {

    public static void main(String[] args) {
        
        // Creating Immutable Collections => 배열데이터를 수정하지 못하도록 막는 방법
        List<String> mutableList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        List<String> immutableList = Collections.unmodifiableList(mutableList);



    }
    
}
