package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

public class BasePage {
    static {
        Configuration.browserSize = "1280x800";
        Configuration.browser = "edge";
        Configuration.headless = false;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    public void navegador(String url) {
        Selenide.open(url);
    }
}
