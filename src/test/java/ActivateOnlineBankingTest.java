import com.codeborne.selenide.Condition;
import org.example.ActivateOnlineBankingPage;
import org.testng.annotations.Test;

import static org.example.Constatnt.SAMPLE_LOGIN;

public class ActivateOnlineBankingTest extends BaseTest {
    private ActivateOnlineBankingPage activateOnlineBankingPage = new ActivateOnlineBankingPage();

    @Test
    public void userLoginTest() {
        activateOnlineBankingPage.fillTheForm();
        activateOnlineBankingPage.submit();
        activateOnlineBankingPage.goBack();
        activateOnlineBankingPage.verifyContent(SAMPLE_LOGIN);
    }
}
