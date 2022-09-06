package ui.pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private ElementsCollection hitGoodsFirstList = $$(".goods__list li");

    @Step("Открыть главную страницу")
    public MainPage openMainPage() {
        open("");
        return this;
    }

    @Step("Кликнуть по случайному товару из первого блока рекомендуемых товаров, на главной странице")
    public MainPage clickRandomGood() {
        actions().sendKeys(Keys.chord(Keys.PAGE_DOWN)).perform();
        int randomValue = (int) (Math.random() * 28);
        hitGoodsFirstList.get(randomValue).click();
        return this;
    }
}
