package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import credenciales.Usuarios;
import org.openqa.selenium.By;
import url.Prod;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class InicioLoginPage extends BasePage {

    Usuarios crendenciales = new Usuarios();
    Prod url1 = new Prod();

    private SelenideElement  botonMakeApp = $(By.id("btn-make-appointment"));
    private SelenideElement campoUsuario = $(By.xpath("//input[@id='txt-username']"));
    private SelenideElement campoContrasena = $(By.xpath("//div/input[@id='txt-password']"));
    private SelenideElement botonLogin = $(By.id("btn-login"));
    private SelenideElement textoInicioSesionvalida = $(By.linkText("Make Appointment"));
    public void entrarAlPagina(){
        navegador(url1.urlPruebas());
    }
    public void clickVistaPrincipal (){
        botonMakeApp.click();
        Selenide.sleep(3000);
    }

    public void escribirUsuario(){
        campoUsuario.sendKeys(crendenciales.getUsuario());
    }

    public void escribirContrasena(){
        campoContrasena.sendKeys(crendenciales.getContrasena());
    }

    public void hacerClickEnBotonLogin(){
        botonLogin.click();
    }

    public void textoVisible(){
        textoInicioSesionvalida.shouldBe(visible);
    }
}
