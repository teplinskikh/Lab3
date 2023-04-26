import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * Output of measurement results as a table for the ArrayList class and LinkedList class
     * @param args main arguments
     */
    public static void main(String[] args) {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            System.out.printf("%-25s%-25s%-25s%-25s%-25s%n", "", "ADD TO END", "GET", "DELETE", "ADD TO MIDDLE");

            long addToEndArrTime = testAddList(arrayList);
            long addToEndLinkedTime = testAddList(linkedList);
            long getArrTime = testGetList(arrayList);
            long getLinkedTime = testGetList(linkedList);
            long deleteArrTime = testDeleteList(arrayList);
            long deleteLinkedTime = testDeleteList(linkedList);
            long addToMiddleArrTime = testAddInMiddleList(arrayList);
            long addToMiddleLinkedTime = testAddInMiddleList(linkedList);
            System.out.printf("%-25s%-25s%-25s%-25s%-25s%n", "Метод выполнялся раз:", 300000, 10000, 10000, 1000);
            System.out.printf("%-25s%-25s%-25s%-25s%-25s%n", "LinkedList", addToEndLinkedTime + "ms", getLinkedTime + "ms", deleteLinkedTime + "ms", addToMiddleArrTime+ "ms");
            System.out.printf("%-25s%-25s%-25s%-25s%-25s%n", "ArrayList", addToEndArrTime + "ms", getArrTime + "ms", deleteArrTime + "ms", addToMiddleLinkedTime+ "ms");
    }

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
     * Time measurement for the add to middle method
     * @param list object of List class (ArrayList or LinkedList)
     * @return amount of time for add in middle operation
     */
    public static long testAddInMiddleList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(list.size()/2, i);
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

    /**
     * Time measurement for the delete method
     * @param list object of List class (ArrayList or LinkedList)
     * @return amount of time for delete operation
     */
    public static long testDeleteList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}