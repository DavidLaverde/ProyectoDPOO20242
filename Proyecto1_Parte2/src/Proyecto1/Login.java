package Proyecto1;

public class Login {
	private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean autenticar(String usuarioIngresado, String contraseniaIngresada) {
    	return username.equals(usuarioIngresado) && password.equals(contraseniaIngresada);
    }

}
