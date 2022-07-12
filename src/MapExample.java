import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Rahul");
        map.put(101, "Vijay");

        map.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(map);

        map.put(102, "Rahul");
        map.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(map);

    }
}
