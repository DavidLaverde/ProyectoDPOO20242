package Proyecto1;

public abstract class Usuario extends EntidadBase {
	protected String nombre;
    protected String email;
    
    public Usuario(String nombre, String email) {
    	this.nombre = nombre;
    	this.email = email;
    }
    
    public String getNombre() {
    	return nombre;
    }
    
    public String getEmail() {
    	return email;
    }

    public void login() {
    	// logica para login
    }
    
    public void logout() {
    	//logica para logout
    }

}
