public class ExNineFindMax {

    static void main() {
        int[] chet = {3, 6, 9, 12};

        System.out.println(FindMax(chet));
    }

    public static int FindMax(int[] arr) {
        int start = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > start) {
                start = arr[i];
            }
        }
        return start;
    }
}

