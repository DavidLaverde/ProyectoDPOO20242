package Proyecto1;

public class PreguntaVerdaderoFalso {
	private String pregunta;
	private boolean respuestaCorrecta;
	
	public PreguntaVerdaderoFalso(String pregunta, boolean respuestaCorrecta) {
		this.pregunta = pregunta;
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	public boolean verificarRespuesta(boolean respuesta) {
		return respuesta == respuestaCorrecta;
	}
	
	public String getPregunta() {
		return pregunta;	
	}
}
