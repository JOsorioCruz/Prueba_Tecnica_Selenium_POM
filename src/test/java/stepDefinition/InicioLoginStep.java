package stepDefinition;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import pages.InicioLoginPage;

public class InicioLoginStep {
    InicioLoginPage inicio = new InicioLoginPage();

    @Test
    @Description("Ingreso a la pagina principal con crendenciales correctas")
    public void inicioVistaPrincipal() throws InterruptedException {
        inicio.entrarAlPagina();
        inicio.clickVistaPrincipal();
        inicio.escribirUsuario();
        inicio.escribirContrasena();
        inicio.hacerClickEnBotonLogin();
        Selenide.sleep(2000);
        inicio.textoVisible();
        WebDriverRunner.closeWebDriver();
    }
}
