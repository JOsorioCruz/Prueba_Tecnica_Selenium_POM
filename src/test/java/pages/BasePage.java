package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    static {
        String navegador = "chrome"; //edge, firefox, chrome

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-password-manager-reauthentication");
        options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
        }});

        if(navegador.equals("chrome")){
            Configuration.browser = navegador;
            Configuration.browserCapabilities = options;
            Configuration.headless = false;
            SelenideLogger.addListener("allure", new AllureSelenide());
        }else{
            Configuration.browser = navegador;
            Configuration.headless = false;
            SelenideLogger.addListener("allure", new AllureSelenide());
        }
    }
    public void navegador(String url) {
        Selenide.open(url);
    }
}