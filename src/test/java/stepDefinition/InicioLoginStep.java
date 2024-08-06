package stepDefinition;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import credenciales.Usuarios;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import pages.InicioLoginPage;

public class InicioLoginStep extends InicioLoginPage {
    Usuarios crendenciales = new Usuarios();
    InicioLoginPage inicioLogin = new InicioLoginPage();
    @Test
    @Feature("inicio de sesion exitoso")
    @Description("Verificar Ingreso a la pagina principal con crendenciales correctas")
    public void inicioExitoso() {
        inicioLogin.entrarAlPagina();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(crendenciales.getUsuario());
        inicioLogin.escribirContrasena(crendenciales.getContrasena());
        inicioLogin.hacerClickEnBotonLogin();
        Selenide.sleep(2000);
        inicioLogin.textoVisible();
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @Feature("inicio de sesion fallido")
    @Description("Verificar el ingreso a la pagina principal con contrasena incorrecta")
    public void inicioFallido() {
        inicioLogin.entrarAlPagina();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(crendenciales.getUsuario());
        inicioLogin.escribirContrasena("xxxxxxxxxx");
        inicioLogin.hacerClickEnBotonLogin();
        Selenide.sleep(2000);
        inicioLogin.textoNoVisible();
        inicioLogin.textoVisibleDos();
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @Feature("inicio de sesion fallido")
    @Description("Verificar el ingreso a la pagina principal con usuario incorrecto")
    public void inicioFallidoDos() {
        inicioLogin.entrarAlPagina();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario("xxxxxxxxxxxx");
        inicioLogin.escribirContrasena(crendenciales.getContrasena());
        inicioLogin.hacerClickEnBotonLogin();
        Selenide.sleep(2000);
        inicioLogin.textoNoVisible();
        inicioLogin.textoVisibleDos();
        WebDriverRunner.closeWebDriver();
    }
}