package ui.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CardProductPage {
    private SelenideElement addToCart = $("button.btn-main:nth-child(2)", 1),
            addToWishlist = $(".order-to-poned", 1);

    @Step("Нажать на кнопку Добавить в корзину")
    public CardProductPage clickToAddToCardButton() {
        addToCart.click();
        return this;
    }

    @Step("Нажать на кнопку добавить в избранное(сердечко)")
    public CardProductPage clickToAddToWishlistButton() {
        addToWishlist.click();
        return this;
    }
}
