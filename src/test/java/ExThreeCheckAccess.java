public class ExThreeCheckAccess {

    static void main() {
        int age = 12;
        System.out.println(checkAccess(age));
    }

    public static String checkAccess(int age) {
        if (age > 18) {
            System.out.println("Allowed");
            return "you can pass";
        } else {
            System.out.println("Denied");
            return "you shall not pass";
        }
    }
}