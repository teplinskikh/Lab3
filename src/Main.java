import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * Time measurement for the add method
     * @param list object of List class (ArrayList or LinkedList)
     * @return amount of time for add operation
     */
    public static long testAddList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 300000; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Time measurement for the get method
     * @param list object of List class (ArrayList or LinkedList)
     * @return amount of time for get operation
     */
    public static long testGetList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int val = list.get(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}