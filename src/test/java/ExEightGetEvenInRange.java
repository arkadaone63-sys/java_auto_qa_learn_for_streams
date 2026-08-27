public class ExEightGetEvenInRange {
    static void main() {
        int start = 1;
        int end = 11;
        System.out.println(getEvenInRange(start, end));
    }

    public static String getEvenInRange(int start, int end) {
        String result = " ";
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("chet");
                result = result + i;
            }
        }
        return result;
    }
}

