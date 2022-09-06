package ui.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CartTest extends TestBase {

    @Test
    @DisplayName("Количество добавленных товаров отображается в Корзине, в хэдере страницы")
    void addCartTest() {
        String expectCountAddedToCard = "1";

        mainPage.openMainPage()
                .clickRandomGood();
        cardProductPage.clickToAddToCardButton();
        appHeaderPage.checkCountCart(expectCountAddedToCard);
    }

    @Test
    @DisplayName("При добавлении товара в список избранных неавторизованному пользователю отображается страница Авторизации и создания аккаунта")
    void redirectToAuthPageUnauthorizedUserAddedProductToWishlist() {
        String expectedHeaderAuthPage = "Войти или создать профиль";

        mainPage.openMainPage()
                .clickRandomGood();
        cardProductPage.clickToAddToWishlistButton();
        authPage.checkHeaderAuthPage(expectedHeaderAuthPage);
    }
}
