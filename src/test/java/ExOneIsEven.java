
    public class ExOneIsEven {
        static void main() {
            int n = 1;
            System.out.println(isEven(n));
        }
        public static boolean isEven(int n) {
            if (n % 2 == 0) {
                System.out.println("chet");
                return true;
            }

            else {
                System.out.println("ne chet");
                return false;
            }
        }
    }