import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsStudy03 {

    public static void main(String[] args) {
        
        // Synchronization
        List<String> unsynchronizedList = new ArrayList<>();
        List<String> synchronizedList = Collections.synchronizedList(unsynchronizedList);

        // synchronizedLis를 여러 스레드에서 안전하게 사용
        System.out.println(synchronizedList);

        // 동기적으로 실행함에 의미가 있는거지!
        

    }
    
}
