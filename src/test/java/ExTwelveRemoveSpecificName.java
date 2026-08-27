import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExTwelveRemoveSpecificName {

    static void main() {
        List<String> names = Arrays.asList("Bob", "Alice", "Jax", "Zoe");

        List<String> blacklist = removeSpecificName(names, "Zoe");

        System.out.println(blacklist);
    }

    public static List<String> removeSpecificName(List<String> list, String nameToRemove) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (!name.equals(nameToRemove)) {
                result.add(name);
            }
        }
        return result;
    }
}
