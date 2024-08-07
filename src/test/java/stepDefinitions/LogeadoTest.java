package stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import credenciales.Login;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import pages.DashboarPage;

import java.sql.Date;

public class LogeadoTest {
    private Login inicioLogin = new Login();
    private DashboarPage dashboard = new DashboarPage();
    Faker random = new Faker();

    @Test
    @Feature("Make Appointment")
    @Description("Verificicar make appointment exitoso, seleccionando opcion: al azar")
    public void makeAppointmente1(){
        inicioLogin.inicioLogeado();
        dashboard.validarNombreDeLaPagina();
        dashboard.validarBoxModelTituloConfirmacion();
        dashboard.seleccionarOpcionDropDown();
        dashboard.seleccionarCheckBox();
        dashboard.seleccionarRadioButton();
        dashboard.elegirFecha();
        dashboard.escribir(random.random().toString());
        dashboard.hagoClickEnBookAppointment();
        dashboard.validarConfirmacionAppointment();
        Selenide.closeWebDriver();
    }

    @Test
    @Feature("Make Appointment")
    @Description("Verificicar make appointment fallido, sin seleccionar fecha")
    public void makeAppointmente2(){
        inicioLogin.inicioLogeado();
        dashboard.validarNombreDeLaPagina();
        dashboard.seleccionarOpcionDropDown();
        dashboard.seleccionarCheckBox();
        dashboard.seleccionarRadioButton();
        dashboard.escribir(random.random().toString());
        dashboard.hagoClickEnBookAppointment();
        dashboard.validarNoConfirmacionAppointment();
        Selenide.closeWebDriver();
    }

    @Test
    @Feature("Make Appointment")
    @Description("Verificicar make appointment exitoso, sin seleccionar check box")
    public void makeAppointmente3(){
        inicioLogin.inicioLogeado();
        dashboard.validarNombreDeLaPagina();
        dashboard.seleccionarOpcionDropDown();
        dashboard.seleccionarRadioButton();
        dashboard.elegirFecha();
        dashboard.escribir(random.random().toString());
        dashboard.hagoClickEnBookAppointment();
        dashboard.validarConfirmacionAppointment();
        Selenide.closeWebDriver();
    }

    @Test
    @Feature("Make Appointment")
    @Description("Verificicar make appointment exitoso, sin escribir comentarios")
    public void makeAppointmente4(){
        inicioLogin.inicioLogeado();
        dashboard.validarNombreDeLaPagina();
        dashboard.seleccionarOpcionDropDown();
        dashboard.seleccionarCheckBox();
        dashboard.seleccionarRadioButton();
        dashboard.elegirFecha();
        dashboard.hagoClickEnBookAppointment();
        dashboard.validarConfirmacionAppointment();
        Selenide.closeWebDriver();
    }
}
