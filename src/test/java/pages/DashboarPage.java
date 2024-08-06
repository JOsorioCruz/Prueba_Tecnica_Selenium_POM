package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import url.Prod;
import static com.codeborne.selenide.Selenide.$;

public class DashboarPage extends BasePage{

    private SelenideElement facilityDropDown = $(By.xpath("//select[@id='combo_facility']"));

    public void clickFacilityDropDown(){
        facilityDropDown.click();
    }

    public void seleccionarOpcionDropDown1() {
        facilityDropDown.selectOption("Tokyo CURA Healthcare Center");
    }

    public void seleccionarOpcionDropDown2() {
        facilityDropDown.selectOption("Seoul CURA Healthcare Center");
    }

}
