import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;
import static org.example.Constatnt.URL;

public abstract class BaseTest {

    @BeforeTest
    public void beforeTest() {
        open(URL);
    }
}
