package stepDefinition;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.*;
import pages.InicioLoginPage;

public class InicioLoginStep {
    InicioLoginPage inicio = new InicioLoginPage();

    @Given("el usuario esta en la pagina principal")
    public void elUsuarioEstaEnLaPaginaPrincipal() {
        inicio.entrarAlPagina();
    }

    @When("selecciona la opcion \"Make Appointment\"")
    public void seleccionaLaOpcion() {
        inicio.clickVistaPrincipal();
    }

    @And("ingresa el username valido")
    public void ingresaElUsernameValido() {
        inicio.escribirUsuario();
    }

    @And("ingresa el password valido")
    public void ingresaElPasswordValido() {
        inicio.escribirContrasena();
    }

    @And("selecciona el boton \"Login\"")
    public void seleccionaElBoton() {
        inicio.hacerClickEnBotonLogin();
    }

    @Then("se abre la pantalla de inicio")
    public void seAbreLaPantallaDeInicio() {
        Selenide.sleep(3000);
        inicio.textoVisible();
        WebDriverRunner.closeWebDriver();
    }
}
