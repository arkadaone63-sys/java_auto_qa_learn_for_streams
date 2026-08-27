import org.junit.jupiter.api.Test;

import java.util.List;

public class anotherClass {
    @Test
    void test() {
        TestMain testMain = new TestMain();
    }

    public static String getHi() {
        return "high";
    }

    public static String capital(String text) {
        return text.toUpperCase();
    }

    public static String[] getWords() {
        String[] result = {"first", "second"};
        return result;
    }

    public static List<String> getBerries() {
        return List.of("redberry", "blackberry");
    }
}
