package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.util.Random;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DashboarPage extends BasePage{

    private SelenideElement facilityDropDown = $(By.xpath("//select[@id='combo_facility']"));
    private SelenideElement checkBoxApplyForHospital = $(By.xpath("//input[@id='chk_hospotal_readmission']"));
    private SelenideElement healthcareMedicare = $(By.id("radio_program_medicare"));
    private SelenideElement healthcareMedicaid = $(By.id("radio_program_medicaid"));
    private SelenideElement healthcareNone = $(By.id("radio_program_none"));
    private SelenideElement campoFecha =  $(By.xpath("//input[@id='txt_visit_date']"));
    private SelenideElement campoComentario = $(By.xpath("//textarea[@id='txt_comment']"));
    private SelenideElement botonClickBook = $(By.xpath("//button[@id='btn-book-appointment']"));
    private SelenideElement tituloConfirmacion = $(By.xpath("//h2"));
    private SelenideElement botonGoToHomePage = $(By.xpath("//a[@class='btn btn-default']"));


    public void seleccionarCheckBox(){
         checkBoxApplyForHospital.click();
     }
    public void seleccionarOpcionDropDown(){
        int opcion;
        Random random = new Random();
        opcion = random.nextInt(2)+1;
        switch(opcion){
            case 1:
                facilityDropDown.selectOption("Tokyo CURA Healthcare Center");
                break;

            case 2:
                facilityDropDown.selectOption("Seoul CURA Healthcare Center");
                break;
            default:
                throw new IllegalArgumentException("No se escogio una opcon");
        }
    }

    public void seleccionarRadioButton() {
        int opcion;
        Random random = new Random();
        opcion = random.nextInt(3)+1;
        switch (opcion) {
            case 1:
                healthcareMedicare.click();
                break;
            case 2:
                healthcareMedicaid.click();
                break;
            case 3:
                healthcareNone.click();
                break;

            default:
                throw new IllegalArgumentException("No se Selecciono nada");
        }
    }

    public void elegirFecha() {
        Random random = new Random();
        int dd= random.nextInt(30)+1;
        int mm= random.nextInt(5)+8;
        int anio=2024;
        String fechaTexto= dd+"/"+mm+"/"+anio;
        campoFecha.sendKeys(fechaTexto);
    }

    public void escribir(String texto){
        campoComentario.sendKeys(texto);
    }

    public void hagoClickEnBookAppointment(){
        botonClickBook.click();
    }

    public void validarConfirmacionAppointment() {
        botonGoToHomePage.shouldBe(visible);
        tituloConfirmacion.shouldBe(visible).shouldHave(text("Appointment Confirmation"));
    }

    public void validarBoxModelTituloConfirmacion() {
        tituloConfirmacion.shouldHave(cssValue("box-sizing", "border-box"));
        tituloConfirmacion.shouldHave(cssValue("display", "block"));
        tituloConfirmacion.shouldHave(cssValue("float", "none"));
        tituloConfirmacion.shouldHave(cssValue("line-height", "33px"));
        tituloConfirmacion.shouldHave(cssValue("position", "static"));
        tituloConfirmacion.shouldHave(cssValue("z-index", "auto"));

        String width = tituloConfirmacion.getCssValue("width");
        String height = tituloConfirmacion.getCssValue("height");

        int widthValue = Integer.parseInt(width.replace("px", "").split("\\.")[0]);
        int heightValue = Integer.parseInt(height.replace("px", "").split("\\.")[0]);

        if (widthValue <= 1100 || widthValue >= 1200) {
            throw new AssertionError("Ancho fuera de rango: " + width);
        }

        if (heightValue <= 30 || heightValue >= 35) {
            throw new AssertionError("Altura fuera de rango: " + height);
        }
    }

    public void validarNoConfirmacionAppointment() {
        tituloConfirmacion.shouldNotBe(visible.negate());
    }
    public void validarNombreDeLaPagina() {
        tituloConfirmacion.shouldBe(visible).shouldHave(text("Make Appointment"));
    }
}
