import org.junit.jupiter.api.Test;

public class LoginPage {
    private String loginInput = "#username";

    public void login(String user) {
        System.out.println("Enter login: " + user);

    }

    public static void main(String[] args) {
        LoginPage page = new LoginPage();
        page.login("admin");
    }
}