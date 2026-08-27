public class ExSixHasBug {

    static void main() {

        String[] messages = new String[] {"Task", "Story", "Bug"};

        System.out.println(hasBug(messages));
    }

    public static boolean hasBug(String[] messages) {

        for ( int i = 0; i < messages.length; i++) {
            if (messages[i] == "Bug") {
                System.out.println("bug has been found");
            }
        }
        return true;
    }
}
