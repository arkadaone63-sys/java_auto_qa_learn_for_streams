import java.util.Arrays;

public class ExTenReverse {

    static void main() {
        String[] chet = {"One", "Two", "Zero"};

        System.out.println(Arrays.toString(reverse(chet)));
    }

    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[arr.length - 1 - i] = arr[i];
        }
        return result;
    }
}
