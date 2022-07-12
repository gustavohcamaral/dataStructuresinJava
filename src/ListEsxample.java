import java.util.ArrayList;
import java.util.List;

public class ListEsxample {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("mango");
        al.add("orange");
        al.add("Grapes");
        al.forEach(System.out::println);
        System.out.println(al);

        al.add("Grapes");
        al.add("orange");
        al.add("mango");
        al.forEach(System.out::println);
        System.out.println(al);

    }

}
