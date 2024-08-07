package stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import credenciales.Login;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.DashboarPage;

import java.sql.Date;

public class LogeadoTest {
    private Login inicioLogin = new Login();
    private DashboarPage dashboard = new DashboarPage();
    Date fecha = new Date(22-02-2024);
    Faker textoRandom = new Faker();


    @Test
    @Feature("Make Appointment")
    @Description("Verificicar make appointment exitoso, seleccionando opcion: medicare")
    public void makeAppointmente(){
        inicioLogin.inicioLogeado();
        dashboard.validarNombreDeLaPagina();
        dashboard.seleccionarOpcionDropDown(2);
        dashboard.seleccionarCheckBox();
        dashboard.seleccionarRadioButton(2);
        dashboard.elegirFecha(fecha);
        dashboard.escribir(textoRandom.random().toString());
        dashboard.hagoClickEnBookAppointment();
        dashboard.validarConfirmacionAppointment();
        Selenide.closeWebDriver();
    }
}
