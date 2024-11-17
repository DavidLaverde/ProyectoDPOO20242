package Proyecto1;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends Actividad {
	private List<PreguntaVerdaderoFalso> preguntas;
	private int calificacionMinima;
	
	public Quiz(String titulo, String descripcion, int nivelDificultad, int duracionEstimada, int calificacionMinima) {
		super(titulo, descripcion, nivelDificultad, duracionEstimada);
		this.preguntas = new ArrayList<>();
		this.calificacionMinima = calificacionMinima;
	}

    public void agregarPregunta(PreguntaVerdaderoFalso pregunta) {
    	preguntas.add(pregunta);
    }
    
    public int calcularResultado(List<Boolean> respuestas) {
    	int correctas = 0;
    	for (int i = 0; i < preguntas.size(); i++) {
    		if (preguntas.get(i).verificarRespuesta(respuestas.get(i))) {
    			correctas++;
    		}
    	}
    	return (correctas * 100) / preguntas.size();
    }
    
    public boolean esAprobado(int resultado) {
    	return resultado >= calificacionMinima;
    }

}
