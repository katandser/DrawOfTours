import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void create() {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Human());
        }
    }
}
