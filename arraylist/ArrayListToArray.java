package arraylist;
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Green");
        stringList.add("Blue");
        stringList.add("Orange");

        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}