package Proyecto1;

import java.util.Date;
import java.util.List;

public class Actividad extends EntidadBase{
	protected String titulo;
    protected String descripcion;
    protected String objetivo;
    protected int nivelDificultad;
    protected int duracionEstimada;
    protected List<Actividad> prerrequisitos;
    protected Date fechaLimite;

    public Actividad(String titulo, String descripcion, int nivelDificultad, int duracionEstimada) {
    	this.titulo = titulo;
    	this.descripcion = descripcion;
    	this.nivelDificultad = nivelDificultad;
    	this.duracionEstimada = duracionEstimada;
    }
    
    public void iniciar() {
    	System.out.println("Actividad iniciada: " + titulo);
    }
    
    public void completar() {
    	System.out.println("Actividad completada: " + titulo);
    }
}
