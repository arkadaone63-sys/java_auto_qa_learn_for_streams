import java.util.Arrays;
import java.util.List;

public class ExElevenCalcAverage {

    static void main() {
        List<Integer> chet = Arrays.asList(10, 20, 30);

        System.out.println(calcAverage(chet));
    }

    public static double calcAverage(List<Integer> list) {
        int sum = 0;

        for(int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return (double) sum / list.size();
    }
}
