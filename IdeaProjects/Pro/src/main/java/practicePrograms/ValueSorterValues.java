package practicePrograms;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ValueSorterValues {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(5, "Apple");
        unsortedMap.put(2, "Banana");
        unsortedMap.put(8, "Orange");
        unsortedMap.put(1, "Grapes");

        // Sort the HashMap by values
        Map<Integer, String> sortedMap = sortHashMapByValue(unsortedMap);

        // Display the sorted HashMap
        System.out.println("Sorted HashMap by Values: " + sortedMap);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortHashMapByValue(HashMap<K, V> map) {
        // Convert the HashMap entries to a List
        List<Map.Entry<K, V>> entryList = new ArrayList<>(map.entrySet());

        // Sort the List by values using streams
        entryList.sort(Map.Entry.comparingByValue());

        // Convert the sorted List back to a HashMap

        return entryList.stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));
    }
}
