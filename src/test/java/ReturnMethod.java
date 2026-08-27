import org.junit.jupiter.api.Test;

public class ReturnMethod {
    public int calculateBonus(int salary) {
        return salary / 10;
    }
    @Test
    void testBonus() {
        int mySalary = 1000;

        int bonus = calculateBonus(mySalary);
        System.out.println("Your bonus " + bonus);
    }
}
