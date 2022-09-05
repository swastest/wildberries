package ui.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthTests extends TestBase {
    String validPhone = faker.numerify("##########"),
    badCode = faker.numerify("####");

    @Test
    @DisplayName("При пустом значении номера телефона отображается ошибка валидации")
    void errorValidationMessageWithEmptyPhone() {
        authPage.openAuthPage()
                .clickGetCodeButton()
                .checkErrorValidationPhoneMessage("Введите номер телефона!");
    }

    @Test
    @DisplayName("Отображается экран ввода кода, при корректно введеном номере телефона")
    void checkCodeDisplayWithValidPhone(){
        String expectTitleConfirmCode = "Введите код";

        authPage.openAuthPage()
                .setLoginPhone(validPhone)
                .clickGetCodeButton()
                .checkTitleCode(expectTitleConfirmCode)
                .checkPhone("+7"+validPhone);
    }

    @Test
    @DisplayName("При неверно введеном коде подтверждения отображается ошибка")
    void checkBadCodeMessage(){
        String expectErrorBadCodeMessage = "Неверный код";

        authPage.openAuthPage()
                .setLoginPhone(validPhone)
                .clickGetCodeButton()
                .setConfirmCode(badCode)
                .checkBadCodeMessage(expectErrorBadCodeMessage);
    }

}
