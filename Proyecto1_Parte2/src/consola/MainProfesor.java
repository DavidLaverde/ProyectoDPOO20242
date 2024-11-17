package consola;

import Proyecto1.*;
import java.util.Scanner;

public class MainProfesor {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, Profesor. Por favor, inicie sesión.");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Correo: ");
        String email = scanner.nextLine();

        Profesor profesor = new Profesor(nombre, email);

        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear Learning Path");
            System.out.println("2. Crear Quiz de Verdadero/Falso");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título del Learning Path: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();
                    profesor.crearLearningPath(titulo, descripcion);
                    System.out.println("Learning Path creado con éxito.");
                    break;

                case 2:
                    System.out.print("Título del Quiz: ");
                    String tituloQuiz = scanner.nextLine();
                    Quiz quiz = new Quiz(tituloQuiz, "Descripción", 1, 20, 60);
                    System.out.println("Agregue preguntas de Verdadero/Falso:");

                    boolean agregarMas = true;
                    while (agregarMas) {
                        System.out.print("Escriba la pregunta: ");
                        String pregunta = scanner.nextLine();
                        System.out.print("¿La respuesta es verdadera? (true/false): ");
                        boolean respuesta = scanner.nextBoolean();
                        scanner.nextLine();

                        quiz.agregarPregunta(new PreguntaVerdaderoFalso(pregunta, respuesta));
                        System.out.print("¿Desea agregar otra pregunta? (true/false): ");
                        agregarMas = scanner.nextBoolean();
                        scanner.nextLine();
                    }
                    System.out.println("Quiz creado con éxito.");
                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
