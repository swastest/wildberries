package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class AppHeaderPage {
    private SelenideElement counterCart = $(".navbar-pc__notify");

    @Step("В иконке корзины отображается количество добавленного товара")
    public AppHeaderPage checkCountCart(String count) {
        counterCart.shouldHave(Condition.text(count));
        return this;
    }
}
