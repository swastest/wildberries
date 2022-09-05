package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthPage {

    private SelenideElement hrefTermsOfUse = $(".sign-in-page__public>a"),
            errorValidationPhoneMessage = $(".field-validation-error"),
            getCodeButton = $("#requestCode"),
            loginCodeTitle = $(".login__code-title"),
            loginCodeMessage = $(".login__code-message"),
            loginPhoneInput = $(".input-item"),
            codeInput = $(".j-input-confirm-code"),
            badCodeMessage = $(".form-block__message--error",1);


    @Step("Открыть главную страницу авторизации")
    public AuthPage openAuthPage() {
        open("/security/login");
        return this;
    }

    @Step("Ввести логин - номер телефона")
    public AuthPage setLoginPhone(String phone) {
        loginPhoneInput.click();
        loginPhoneInput.sendKeys(phone);
        return this;
    }

    @Step("Отображается экран ввода кода")
    public AuthPage checkTitleCode(String title) {
        loginCodeTitle.shouldHave(Condition.text(title));
        return this;
    }

    @Step("На экране ввода кода отображается ранее введенный номер")
    public AuthPage checkPhone(String phone) {
        loginCodeMessage.shouldHave(Condition.text(phone));
        return this;
    }

    @Step("Нажать на ссылку Правила пользования торговой площадкой")
    public AuthPage clickOnTermsOfUse() {
        hrefTermsOfUse.click();
        return this;
    }

    @Step("Нажать на кнопку Получить код")
    public AuthPage clickGetCodeButton() {
        getCodeButton.click();
        return this;
    }

    @Step("Сообщение ошибке валидации номера телефона")
    public AuthPage checkErrorValidationPhoneMessage(String errorTxt) {
        errorValidationPhoneMessage.shouldHave(Condition.text(errorTxt));
        return this;
    }

    @Step("Ввести код подтверждения из смс")
    public AuthPage setConfirmCode(String code) {
        codeInput.val(code);
        return this;
    }

    @Step("Отображается сообщение об ошибке введенного кода")
    public AuthPage checkBadCodeMessage(String errorBadCode){
        badCodeMessage.shouldHave(Condition.text(errorBadCode));
        return this;
    }
}
