import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * This class uses an ArrayList to demonstrate the capabilities of interface Collection
 * @author--Zheng Wang
 */
public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"magenta","red","white","blue","cyan"};
        List<String> list = new ArrayList<String>();//这里的List就是ArrayList.

        for (String color : colors) {
          list.add(color);
        }

        String[] removeColors = {"red","white","blue"};
        List<String> removeList = new ArrayList<String>();

        for (String color : removeColors) {
            removeList.add(color);
        }

        System.out.println("ArrayList: ");
        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }
        System.out.println();

        removeColors(list, removeList);
        System.out.println(list
        );

    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()) {
            if(collection2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}
