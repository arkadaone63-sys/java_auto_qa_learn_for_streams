import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    @Test
    public void test() {
        printFive();
        System.out.println(returnFive());
        System.out.println(plus(2, 2));
        System.out.println(anotherClass.getHi());
        System.out.println(anotherClass.capital("help me"));

        for(String word: anotherClass.getWords()) {
            System.out.println(word);
        }
        anotherClass.getBerries().forEach(berry -> {
            System.out.println(berry);
        });
    }

    void printFive() {
        System.out.println("5");
    }

    int returnFive() {
        return 5;
    }

    int plus(int a, int b) {
        int result = a + b;
        return result;
    }
}

























































//}
//    public String hi = "Hi";
//    private String bro = "bro";
//
//    @Test
//    void printTest() {
//        String[] flowers = {"Rose", "Fial", "Sunflower"};
//        String[] berries = new String[10];
//
//        flowers[0] = "Blueflower";
//
//        berries[0] = "redberry";
//        berries[1] = "blueberry";
//        berries[2] = "blackberry";
//
//        System.out.println(flowers[0] + " " + flowers[1] + " " + flowers[2]);
//        System.out.println(berries[0] + " " + berries[1] + " " + berries[2]);
//    }
//
//    @Test
//    void printTestArrayList() {
//        List<String> flowers = List.of("Rose", "Fial", "Sunflower");
//        List<String> berries = new ArrayList<>();
//
//        berries.add(0, "redberry");
//        berries.add("blueberry");
//        berries.add(2, "blackberry");
//
//        if (berries.contains("redberry")) {
//            System.out.println("redberry is here");
//        }
//
//        System.out.println(flowers.get(0) + " " + flowers.get(1) + " " + flowers.get(2));
//    }
//}