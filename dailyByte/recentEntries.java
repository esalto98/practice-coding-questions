
/*Keep track of the X most recent entries to a list 
without duplicates (sometimes framed as a line problem).*/
import java.util.*;

public class recentEntries {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);

        printList(solution(list, 5));

    }

    public static void printList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i) + "->");
        }
    }

    // 56778=> 678, 775676=> 756, 1233145=>345
    public static LinkedList<Integer> solution(LinkedList<Integer> list, int entries) {

        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        LinkedList<Integer> recentEntries = new LinkedList<Integer>();
        // iterate through list and if not in counter than insert and increment key
        for (int i = 0; i < list.size(); ++i) {
            int keyCounter = counter.getOrDefault(list.get(i), 0);
            if (keyCounter == 0) {
                recentEntries.add(list.get(i));
                counter.put(list.get(i), keyCounter + 1);
                entries--;
                if (entries < 0) {
                    recentEntries.removeFirst();
                }
            }
        }

        return recentEntries;

    }

}
