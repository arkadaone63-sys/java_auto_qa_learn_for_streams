//
//public class whileLoopExample {
//    public void whileLoopExample() {
//        int attempt = 1;
//        boolean pageLoaded = false;
//
//        while (!pageLoaded) {
//            System.out.println("Status: trying to load page. № " + attempt);
//
//            if (attempt ==2) {
//                System.out.println("log: unknown error on second attempt. Loading...");
//                attempt++;
//                continue;
//            }
//            if (attempt > 5) {
//                System.out.println("log: max attempts(5). Aborted.");
//                break;
//            }
//            pageLoaded = Instant.now().toEpochMilli() % 2 == 0;
//
//            attempt++;
//        }
//    }
//}
