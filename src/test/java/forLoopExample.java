import org.junit.jupiter.api.Test;


public static void main(String[] args) {
    class forLoopExample {
        public void forLoopExampleTest(String[] shelf) {
            for (int i = 0; i < shelf.length; i++) {
                if (i == 4) {
                    System.out.println("Ячейка №5 на ремонте, пропускаем...");
                    continue;
                }
                System.out.println("Проверяем ячейку №" + (i + 1));

                if (shelf[i].equals("Подарок")) {
                    System.out.println("Ура! Подарок найден на позиции" + (i + 1));
                    break;
                }
            }
        }
    }
}
