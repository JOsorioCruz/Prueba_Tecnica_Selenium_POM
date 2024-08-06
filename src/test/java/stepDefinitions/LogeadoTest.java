package stepDefinitions;

import com.codeborne.selenide.Selenide;
import credenciales.Login;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import pages.DashboarPage;

public class LogeadoTest {
    private Login inicioLogin = new Login();
    private DashboarPage dashboard = new DashboarPage();

    @Test
    @Feature("Envio con la primera opcion")
    @Description("Verificar el envio de un mensaje con usuario logeando opcion 1")
    public void seleccionarOpcion1() {
        inicioLogin.inicioLogeado();
        dashboard.clickFacilityDropDown();
        dashboard.seleccionarOpcionDropDown1();
        Selenide.closeWebDriver();
    }

    @Test
    @Feature("Envio con la segunda opcion")
    @Description("Verificar el envio de un mensaje con usuario logeando opcion 2")
    public void seleccionarOpcion2() {
        inicioLogin.inicioLogeado();
        dashboard.clickFacilityDropDown();
        dashboard.seleccionarOpcionDropDown2();
        Selenide.closeWebDriver();
    }
}
