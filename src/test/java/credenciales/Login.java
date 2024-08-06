package credenciales;

import pages.InicioLoginPage;

public class Login {
    private Usuarios crendenciales = new Usuarios();
    private InicioLoginPage inicioLogin = new InicioLoginPage();

    public void inicioLogeado() {
        inicioLogin.entrarAlPagina();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(crendenciales.getUsuario());
        inicioLogin.escribirContrasena(crendenciales.getContrasena());
        inicioLogin.hacerClickEnBotonLogin();
    }
}
