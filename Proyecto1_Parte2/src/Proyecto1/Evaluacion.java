package Proyecto1;

public class Evaluacion {
	private float calificacion;
    private String comentarios;
    
    public Evaluacion(float calificacion, String comentarios) {
    	this.calificacion = calificacion;
    	this.comentarios = comentarios;
    }
    
    public float getCalificacion() {
    	return calificacion;
    }
    
    public String getComentarios() {
    	return comentarios;
    }

    public void calificar(float nuevaCalificacion, String nuevoComentario) {
    	this.calificacion = nuevaCalificacion;
    	this.comentarios = nuevoComentario;
    }

}
