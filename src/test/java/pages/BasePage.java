package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;

public class BasePage {

    public void navegador(String url) {
        Configuration.browserSize = "1280x800";
        Configuration.browser = "chrome";
        SelenideLogger.addListener("allure", new AllureSelenide());
        Selenide.sleep(2000);
        Selenide.open(url);
    }
}
