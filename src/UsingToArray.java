import java.util.Arrays;
import java.util.LinkedList;

/**
 * This class practices Arrays' asList method
 * @author--Zheng Wang
 */
public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black","blue","yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red");
        links.add("pink");
        links.add(3,"orange");
        links.add(4,"cyan");

        colors = links.toArray(new String[links.size()]);

        System.out.println("Colors:");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
