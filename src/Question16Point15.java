/**
 * This class creates a LinkedList object of 10 characters -- Done
 * Then creates a second LinkedList object containing a copy of the first list, but in reverse order. -- Done
 * @author--Zheng Wang
 */
import java.util.Arrays;
import java.util.LinkedList;

public class Question16Point15 {
    public static void main(String[] args) {
        Character[] characters = {'a','b','c','d','e','f','g','h','i','j'};//use wrappers here , not Char.
        LinkedList<Character> list = new LinkedList<>(Arrays.asList(characters));
        System.out.println(list);//the output is [a, b, c, d, e, f, g, h, i, j]

        LinkedList<Character> listReversed = list.reversed();
        System.out.println(listReversed);//output is [j, i, h, g, f, e, d, c, b, a]
    }
}
