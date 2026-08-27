import org.junit.jupiter.api.Test;

public class ParamsMethod {
    public void printUserInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    @Test
    void Test() {
        printUserInfo("Anna", 25);
    }
}
