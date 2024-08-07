package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.sql.Date;
import java.text.SimpleDateFormat;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboarPage extends BasePage{

    private SelenideElement facilityDropDown = $(By.xpath("//select[@id='combo_facility']"));
    private SelenideElement checkBoxApplyForHospital = $(By.xpath("//input[@id='chk_hospotal_readmission']"));
    private SelenideElement healthcareMedicare = $(By.id("radio_program_medicare"));
    private SelenideElement healthcareMedicaid = $(By.id("radio_program_medicaid"));
    private SelenideElement healthcareNone = $(By.id("radio_program_none"));
    private SelenideElement campoFecha =  $(By.xpath("//input[@id='txt_visit_date']"));
    private SelenideElement campoComentario = $(By.xpath("//textarea[@id='txt_comment']"));
    private SelenideElement botonClickBook = $(By.id("btn-book-appointment"));

    private SelenideElement tituloConfirmacion = $(By.xpath("//h2"));
    public void seleccionarCheckBox(){
         checkBoxApplyForHospital.click();
     }
    public void seleccionarOpcionDropDown(int opcion){
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

    public void seleccionarRadioButton(int opcion) {
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

    public void elegirFecha(Date fecha) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fechaTexto = formatter.format(fecha);
        campoFecha.sendKeys(fechaTexto);
        campoFecha.pressEnter();
    }

    public void escribir(String texto){
        campoComentario.sendKeys(texto);
    }

    public void hagoClickEnBookAppointment(){
        botonClickBook.click();
    }

    /*
    Mejorar la logica porqeue la prueba esta fallando cuando los
    elementos estan visibles pero cuando coloco visible.negate()
    la prueba pasa exitos
    */
    public void validarConfirmacionAppointment() {
        tituloConfirmacion.shouldBe(visible).shouldHave(text("Appointment Confirmation"));
    }
    public void validarNombreDeLaPagina() {
        tituloConfirmacion.shouldBe(visible).shouldHave(text("Make Appointment"));
    }
}
