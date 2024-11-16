package Proyecto1;

import java.util.Date;

public class Tarea extends Actividad{
	private String instrucciones;
    private Date fechaEntrega;
    
    public Tarea(String titulo, String descripcion, int nivelDificultad, int duracionEstimada, String instrucciones) {
    	super(titulo, descripcion, nivelDificultad, duracionEstimada);
    	this.instrucciones = instrucciones;
    }

}
