public class ExSevenSumTon {
    static void main() {
        int n = 11;
        System.out.println(sumToN(n));
    }

    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = sum + n;
            System.out.println(n);
        }
        return sum;
    }
}
