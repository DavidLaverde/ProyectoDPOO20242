package Proyecto1;

public class Profesor extends Usuario {
	public Profesor(String nombre, String email) {
		super(nombre, email);
	}
	
	public void crearLearningPath(String titulo, String descripcion) {
		//Logica crear learning path
	}
	
	public void crearActividad(String titulo, String descripcion) {
		//Logica crear learning path
	}
	
	public void evaluarActividad(Actividad actividad, Evaluacion evaluacion) {
		actividad.completar();
		System.out.println("Actividad evaluada: " + evaluacion.getCalificacion());
	}
}
