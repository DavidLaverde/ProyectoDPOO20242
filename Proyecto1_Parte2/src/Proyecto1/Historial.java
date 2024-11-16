package Proyecto1;

import java.util.ArrayList;
import java.util.List;

public class Historial extends EntidadBase{
	private List<Actividad> actividad;

    public Historial() {
        this.actividad = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad) {
        this.actividad.add(actividad);
    }

    public void obtenerEstadisticas() {
        System.out.println("Estadísticas del historial:");
        for (Actividad act : actividad) {
            System.out.println("Actividad: " + act.titulo + ", Descripción: " + act.descripcion);
        }
    }

}
