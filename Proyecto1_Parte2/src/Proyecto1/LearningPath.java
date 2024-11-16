package Proyecto1;

import java.util.ArrayList;
import java.util.List;

public class LearningPath extends EntidadBase{
	private String titulo;
    private String descripcion;
    private int nivelDificultad;
    private int duracionTotal;
    private float rating;
    private List<Actividad> actividades;
    
    public LearningPath(String titulo, String descripcion, int nivelDificultad) {
    	this.titulo = titulo;
    	this.descripcion = descripcion;
    	this.nivelDificultad = nivelDificultad;
    	this.actividades = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad) {
    	actividades.add(actividad);
    }
    
    public void removerActividad(Actividad actividad) {
    	actividades.remove(actividad);
    }
    
    public float calcularProgreso() {
    	//implementar calculo de progreso
    	return 0.0f;
    }

}
