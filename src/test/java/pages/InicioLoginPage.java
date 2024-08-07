package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import url.Prod;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class InicioLoginPage extends BasePage {
    private Prod url = new Prod();
    private SelenideElement tituloPrincipal = $(By.xpath("//h1"));
    private SelenideElement botonMakeApp = $(By.id("btn-make-appointment"));
    private SelenideElement campoUsuario = $(By.xpath("//input[@id='txt-username']"));
    private SelenideElement campoContrasena = $(By.xpath("//div/input[@id='txt-password']"));
    private SelenideElement botonLogin = $(By.id("btn-login"));
    private SelenideElement textoInicioSesionValida = $(By.linkText("Make Appointment"));
    private SelenideElement mensajeDeErrorInicioSesion = $(By.linkText("Login failed! Please ensure the username and password are valid."));

    public void validarNombreDelTituloPrincipal() {
        tituloPrincipal.shouldBe(visible).shouldHave(text("CURA Healthcare Service"));
    }
    public void entrarAlPagina(){
        navegador(url.urlPruebas());
    }

    public void validarBoxModelBotonMakeApp() {
        botonMakeApp.shouldHave(cssValue("width", "176.938px"));
        botonMakeApp.shouldHave(cssValue("height", "46px"));
        botonMakeApp.shouldHave(cssValue("box-sizing", "border-box"));
        botonMakeApp.shouldHave(cssValue("display", "inline-block"));
        botonMakeApp.shouldHave(cssValue("float", "none"));
        botonMakeApp.shouldHave(cssValue("line-height", "24px"));
        botonMakeApp.shouldHave(cssValue("position", "static"));
        botonMakeApp.shouldHave(cssValue("z-index", "auto"));
    }

    public void clickVistaPrincipal (){
        botonMakeApp.click();
        Selenide.sleep(3000);
    }

    public void escribirUsuario(String text){
        campoUsuario.sendKeys(text);
    }

    public void escribirContrasena(String text){
        campoContrasena.sendKeys(text);
    }

    public void hacerClickEnBotonLogin(){
        botonLogin.click();
    }

    public void textoVisible(){
        textoInicioSesionValida.shouldBe(visible);
    }

    public void textoVisibleDos(){
        mensajeDeErrorInicioSesion.shouldNotBe(visible);
    }
}

