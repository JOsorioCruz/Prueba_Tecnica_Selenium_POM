package stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import credenciales.Login;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import pages.DashboarPage;

public class LogeadoTest {
    private Login inicioLogin = new Login();
    private DashboarPage dashboard = new DashboarPage();
    Faker random = new Faker();

    @Test
    @Feature("Make Appointment")
    @Description("Verificar la realización de una cita exitosa seleccionando una opción del menú desplegable al azar")
    public void makeAppointmenteDropDownAlAzar(){
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
    @Description("Verificicar falla al realizar un cita, sin seleccionar fecha")
    public void makeAppointmentSinFecha(){
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
    @Description("Verificar realizacion de una cita exitosa sin seleccionar la casilla de verificación")
    public void makeAppointmenteSinCasillaDeVerificaion(){
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
    @Description("Verificicar realizacion de una cita exitosa, sin escribir comentarios")
    public void makeAppointmenteSinComentarios(){
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
