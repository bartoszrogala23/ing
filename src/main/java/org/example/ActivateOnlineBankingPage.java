package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.example.Constatnt.*;

public class ActivateOnlineBankingPage {

    private SelenideElement loginInput = $(By.name("ctl00$CPH$Content_NPH_Login"));
    private SelenideElement documentTypeDropdown = $(By.id("ctl00_CPH_SelectedOptionID_DropDown1_NPH_TypIdentyfikatora"));
    private SelenideElement passport = $(By.xpath("//*[@class='dropdown-menu open']//*[contains(text(),'Paszport')]"));
    private SelenideElement passportNumberInput = $(By.name("ctl00$CPH$Content_NPH_NumerPaszportu"));
    private SelenideElement mothersNameInput = $(By.name("ctl00$CPH$Content_NPH_NazwiskoRodoweMatki"));
    private SelenideElement submitButton = $(By.name("ctl00$CPH$nav_G010_TwojeDane_Button1_a010_Dalej"));
    private SelenideElement backButton = $(By.id("ctl00_CPH_nav_G020_HasloDoBankowosciBezSzyfrowania_Button2_a040_Wstecz"));
    private SelenideElement loginContent = $(By.name("ctl00$CPH$Content_NPH_Login"));

    public void fillField(SelenideElement inputElement, String input) {
        inputElement.sendKeys(input);
    }

    public void fillTheForm() {
        fillField(loginInput, SAMPLE_LOGIN);
        selectFromDropdown();
        fillField(passportNumberInput, SAMPLE_PASSPORT_NUMBER);
        fillField(mothersNameInput, SAMPLE_SURNAME);
    }

    public void selectFromDropdown() {
        documentTypeDropdown.click();
        passport.click();
    }

    public void submit() {
        submitButton.click();
    }

    public void goBack() {
        backButton.click();
    }

    public void verifyContent(String content) {
        loginContent
                .shouldHave(Condition.value(content))
                .as("login input should contain value: " + content);
    }
}
