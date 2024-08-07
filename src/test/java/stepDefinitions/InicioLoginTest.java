package stepDefinitions;

import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;
import credenciales.Usuarios;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import pages.InicioLoginPage;

public class InicioLoginTest extends InicioLoginPage {
    Usuarios crendenciales = new Usuarios();
    InicioLoginPage inicioLogin = new InicioLoginPage();
    Faker credencialesRandom = new Faker();
    @Test
    @Feature("inicio de sesion")
    @Description("Verificar el ingreso a la página principal con credenciales correctas")
    public void inicioExitoso() {
        inicioLogin.entrarAlPagina();
        inicioLogin.validarNombreDelTituloPrincipal();
        inicioLogin.validarBoxModelBotonMakeApp();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(crendenciales.getUsuario());
        inicioLogin.escribirContrasena(crendenciales.getContrasena());
        inicioLogin.hacerClickEnBotonLogin();
        inicioLogin.textoVisible();
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @Feature("inicio de sesion")
    @Description("Verificar el ingreso fallido a la página principal con contraseña incorrecta")
    public void inicioFallidoConContrasena() {
        inicioLogin.entrarAlPagina();
        inicioLogin.validarNombreDelTituloPrincipal();
        inicioLogin.validarBoxModelBotonMakeApp();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(crendenciales.getUsuario());
        inicioLogin.escribirContrasena(credencialesRandom.name().name());
        inicioLogin.hacerClickEnBotonLogin();
        inicioLogin.textoVisibleDos();
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @Feature("inicio de sesion")
    @Description("Verificar el ingreso fallido a la página principal con usuario incorrecto")
    public void inicioFallidoConUsuario() {
        inicioLogin.entrarAlPagina();
        inicioLogin.validarNombreDelTituloPrincipal();
        inicioLogin.validarBoxModelBotonMakeApp();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(credencialesRandom.name().name());
        inicioLogin.escribirContrasena(crendenciales.getContrasena());
        inicioLogin.hacerClickEnBotonLogin();
        inicioLogin.textoVisibleDos();
        WebDriverRunner.closeWebDriver();
    }
}