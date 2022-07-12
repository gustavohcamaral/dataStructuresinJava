import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.forEach(System.out::println);
        System.out.println(set);

        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("six");

        set.forEach(System.out::println);
        System.out.println(set);
    }
}
