public class ExFiveBlastOff {

    static void main() {
        int start = 5;
        System.out.println(blastOff(start));
    }

    public static String blastOff(int start) {
        for (start = 5; start > 0; start--) {
            System.out.println(start);
        }
        return ("GO!");
    }
}
