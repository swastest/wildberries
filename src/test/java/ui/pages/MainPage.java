package ui.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    @Step("Открыть главную страницу")
    public MainPage openMainPage(){
        open("");
        return this;
    }
}
