package credenciales;

import pages.InicioLoginPage;

public class Login {
    private Usuarios crendenciales = new Usuarios();
    private InicioLoginPage inicioLogin = new InicioLoginPage();

    public void inicioLogeado() {
        inicioLogin.entrarAlPagina();
        inicioLogin.validarNombreDelTituloPrincipal();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(crendenciales.getUsuario());
        inicioLogin.escribirContrasena(crendenciales.getContrasena());
        inicioLogin.hacerClickEnBotonLogin();
    }
    public void inicioUsuarioYContrasena(String usuario, String contrasena) {
        inicioLogin.entrarAlPagina();
        inicioLogin.validarNombreDelTituloPrincipal();
        inicioLogin.clickVistaPrincipal();
        inicioLogin.escribirUsuario(usuario);
        inicioLogin.escribirContrasena(contrasena);
        inicioLogin.hacerClickEnBotonLogin();
    }
}
