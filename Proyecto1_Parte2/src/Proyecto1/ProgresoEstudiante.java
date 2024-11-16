package Proyecto1;

import java.util.Date;

public class ProgresoEstudiante {
	private Date fechaInicio;
    private Date fechaCompleta;
    private float porcentajeCompletado;

    public void actualizarProgreso(float progreso) {
    	this.porcentajeCompletado += progreso;
    	System.out.println("Progreso actualizado a " + porcentajeCompletado + "%");
    }

}
