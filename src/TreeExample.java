import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeExample {
    public static void main(String[] args) {
        Integer[] nums = {2,4,1,6,3,7,9,5};
        SortedSet<Integer> treeSet = new TreeSet<>(Arrays.asList(nums));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        printAllTreeSet(treeSet);
        System.out.println(treeSet.add(1));
        System.out.println(treeSet.add(11));
        printAllTreeSet(treeSet);
        printAllTreeSet(treeSet.headSet(7));
        //
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Paradise Lost", 23.56);
        treeMap.put("Golden Treasury", 12.47);
        treeMap.put("Moon and the Sixpence", 65.28);
        treeMap.put("Holinshed", 7.68);
        treeMap.put("Ancient Mariner", 45.36);
        printAllTreeMap(treeMap);
        treeMap.put("Paradise Lost", 23.56);
        printAllTreeMap(treeMap);
        treeMap.put("Paradise Regained", 23.56);
        printAllTreeMap(treeMap);
    }
    public static void printAllTreeSet(SortedSet<Integer> treeSet){
        System.out.println("--");
        treeSet.forEach(System.out::println);
        System.out.println("--");
    }

    public static  void printAllTreeMap(TreeMap<String, Double> treeMap){
        System.out.println("--");
        treeMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("--");
    }

}
