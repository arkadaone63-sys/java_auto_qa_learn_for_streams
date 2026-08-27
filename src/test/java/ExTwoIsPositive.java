public class ExTwoIsPositive {

        static void main() {
            int n = -1;
            System.out.println(isPositive(n));
        }
        public static boolean isPositive(int n) {
            if (n >= 0) {
                System.out.println("positive");
                return true;
            }
            else {
                System.out.println("negative");
                return false;
            }
        }
    }
