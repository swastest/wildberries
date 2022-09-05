package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class TermsOfUsePage {
    private ElementsCollection contentHeader = $$("ul.no-decor-list li");

    public TermsOfUsePage openTermsOfUsePage(){
        open("/services/pravila-polzovaniya-torgovoy-ploshchadkoy");
        return this;
    }

    public TermsOfUsePage checkContent(String[] array){
        for (int i =0; i<contentHeader.size(); i++){
            Assertions.assertEquals(array[i],contentHeader.get(i));
        }
        return this;
    }
}
