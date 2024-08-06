package credenciales;

import pages.InicioLoginPage;

public class Login {
    Usuarios crendenciales = new Usuarios();
    InicioLoginPage inicioLogin = new InicioLoginPage();
    public void inicioLogeado() {
        inicioLogin.entrarAlPagina();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(crendenciales.getUsuario());
        inicioLogin.escribirContrasena(crendenciales.getContrasena());
        inicioLogin.hacerClickEnBotonLogin();
    }
}
