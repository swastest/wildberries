package ui.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TermsTest extends TestBase {
    @Test
    @DisplayName("При клике на ссылку 'Согласен с условиями Правил пользования торговой площадкой', открывается страница с правилами")
    void redirectToTermsPageAndCheckContent() {
        String[] ExpectHeaderContent = {"Торговая площадка", "Владелец Торговой площадки", "Покупатель", "Продавец",
                "Товар", "Личный кабинет", "Пункт выдачи заказов", "Постамат", "Заказ", "Услуги", "Доставка товара «до двери»",
                "Акционная скидка", "Скидка по промокоду", "Промокод", "Скидка постоянного Покупателя", "Баланс"};
        authPage.openAuthPage()
                .clickOnTermsOfUse();
        termsOfUsePage.checkContent(ExpectHeaderContent);
    }
}
