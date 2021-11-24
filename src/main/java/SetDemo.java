import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Nancy");
        set.add("Neville");
        set.add("Adrian");
        set.add("Tummy");
       // set.add("Nancy"); // this will not print
        System.out.println(set);
        System.out.println(set.add("Nancy"));// this will give false

    }
}
