package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AppHeaderPage {
    private SelenideElement loginButton = $("[data-wba-header-name=Login]"),
            cartButton = $("[data-wba-header-name=Cart]"),
            pickUpButton = $("[data-wba-header-name=Pick_up_points]"),
            messageProblemButton = $(".header__btn-chat"),
            helpChatHeader = $(".chat__header-wrap"),
            firstMessageByHelpChat = $(".chat__message");
}
