import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * This class creates 2 LinkedLists of Strings.
 * @author--Zheng Wang
 */
public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"black","yellow","green","blue","violet","silver"};
       // LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        List<String> list1 = new LinkedList<>();

        for (String color : colors) {
            list1.add(color);
        }
        System.out.println(list1);
        String[] colors2 = {"gold","white","brown","blue","gray","silver"};
        LinkedList<String> links2 = new LinkedList<>(Arrays.asList(colors2));
        List<String> list2 = new LinkedList<>();

        for (String color : colors2) {
            list2.add(color);
        }
        System.out.println(list2);
        list1.addAll(list2);
        list2 = null;
        printList(list1);

        convertToUpperCaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleteing elements from 4 to 6...");
        removeItems(list1,4,7);
        printList(list1);
        printReversedList(list1);


    }

    private static void printList(List<String> list){
        System.out.printf("%nlist:%n");

        for (String color : list) {
            System.out.printf("%s ",color);
        }
        System.out.println();
    }

    private static void convertToUpperCaseStrings(List<String> list){
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> list, int start, int end){
        list.subList(start, end).clear();
    }

    private static void printReversedList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReversed List:%n");

        while (iterator.hasPrevious()) {
            System.out.printf("%s ",iterator.previous());
        }
    }
}
