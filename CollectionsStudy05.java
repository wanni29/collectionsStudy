import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsStudy05 {

    public static void main(String[] args) {

        // Sample data
        List<Map.Entry<String, Integer>> data = Arrays.asList(
                new AbstractMap.SimpleEntry<>("apple", 5),
                new AbstractMap.SimpleEntry<>("banana", 3),
                new AbstractMap.SimpleEntry<>("apple", 2),
                new AbstractMap.SimpleEntry<>("banana", 7),
                new AbstractMap.SimpleEntry<>("orange", 4),
                new AbstractMap.SimpleEntry<>("apple", 3));

        // Using HashMap to group data
        Map<String, List<Integer>> dataMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : data) {
            dataMap.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).add(entry.getValue());
        }

        // Using Stream API to process data
        List<Integer> filteredAndDoubledValues = dataMap.getOrDefault("apple", Collections.emptyList())
                .stream()
                .filter(value -> value > 3)
                .map(value -> value * 2)
                .collect(Collectors.toList());

        // Using Stream API to calculate the sum
        int sumOfFilteredValues = filteredAndDoubledValues.stream()
                .reduce(0, Integer::sum);

        System.out.println("Original Data");
        data.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

        System.out.println("\nData as HashMap:");
        dataMap.forEach((key, values) -> System.out.println(key + ":" + values));

        System.out.println("\nFiltered and Doubled Values for 'apple':");
        filteredAndDoubledValues.forEach(System.out::println);

        System.out.println("\nSum of Filterd and Doubled Values for 'apple' : " + sumOfFilteredValues);

    }

}
