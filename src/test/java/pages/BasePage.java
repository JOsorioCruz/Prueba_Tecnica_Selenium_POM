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

    public void click(By localizador){
        $(element(localizador)).click();
    }

    public void escribir(By localizador){
        $(localizador).sendKeys();
    }
//    public void setInputField(WebElement webElement, String text) {
//        wait.until(ExpectedConditions.visibilityOf(webElement));
//        clearTextField(webElement);
//        webElement.sendKeys(text);
//    }
//
//    public void setInputField(By selector, String text) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
//        WebElement webElement = driver.findElement(selector);
//        clearTextField(webElement);
//        webElement.sendKeys(text);
//    }
//
//    public void clearTextField(WebElement webElement) {
//        wait.until(ExpectedConditions.visibilityOf(webElement));
//        webElement.clear();
//    }
//
//    public List<WebElement> findElements(By locator){
//        return driver.findElements(locator);
//    }
//
//    public void frameSwitch(){
//        driver.switchTo().frame("disneyid-iframe");
//    }
//
//
//    public String getText(WebElement element){
//        return element.getText();
//    }
//
//    public String getText(By locator){
//        return driver.findElement(locator).getText();
//    }
//
//    public void type(String inputText, By locator){
//        driver.findElement(locator).sendKeys(inputText);
//    }
//
//    public  Boolean isDisplayed(By locator){
//        try {
//            return driver.findElement(locator).isDisplayed();
//        }catch (org.openqa.selenium.NoSuchElementException e){
//            return false;
//        }
//    }
//
//    public void enter(By locator) {
//        driver.findElement(locator).sendKeys(Keys.ENTER);
//    }
//
//
//    public void visit(String url){
//        driver.get(url);
//    }
//
//    public void waitForElementToAppear(By find){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(find));
//    }
}
