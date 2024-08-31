package UTN.presentacion;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        //Se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDao = new EstudianteDAO(); //Esta instancia debe hacerse otra vez
        while (!salir){
            try{
                mostrarMenu(); //Este sera el metodo que devolvera un booleano
                salir = ejecutarOpciones(consola, estudianteDao); //Esto arroja una exception
            } catch (Exception e) {
                System.out.println("Ocurrio un error al ejecutar la operacion: "+e.getMessage());
            }
        }
    } // Fin main

    //Metodo para ejecutar las opciones, va a regresar un valor booleano, ya que es el que
    //puede modificar el valor de la variable salir, si es verdadero termina el ciclo while
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDao) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 -> { //Listar estudiantes
                System.out.println("Listado de Estudiantes...");
                //no muestra la información, solo recupera la info y regresa una lista
                var estudiante = estudianteDao.listarEstudiantes();
                //vamos a iterar cada objeto de tipo estudiante
                estudiante.forEach(System.out::println); //para imprimir la lista
            } //Fin caso 1
            case 2 -> { //Buscar estudiante por id
                System.out.println("Introduce el id del estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDao.bucarEstudiantePorId(estudiante);
                if (encontrado)
                    System.out.println(" Estudiante encontrado: " + estudiante);
                else
                    System.out.println("Estudiante NO encontrado: " + estudiante);
            } //Fin del caso 2
            case 3 -> { //Agregar estudiante
                System.out.println("Agregar estudiante: ");
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crear objeto estududiante (sin id)
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDao.agregarEstudiante(estudiante);
                if (agregado)
                    System.out.println("Estudiante agregado: " + estudiante);
                else
                    System.out.println("Estudiante no ha sido agregado: " + estudiante);
            } // Fin del caso 3
            case 4 -> { //Modificar estudiante
                System.out.println("Modificar estudiante: ");
                //Aqui lo primero es especificar cual es el id del objeto a modificar
                System.out.println("Id Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //Creamos un objeto estudiante a modificar
                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDao.modificarEstudiante(estudiante);
                if(modificado)
                    System.out.println("Estudiante modificado: "+ estudiante);
                else
                    System.out.println("Estudiante no ha sido modificado: "+estudiante);
            }
            case 5 -> { //Eliminar estudiante
                System.out.println("Eliminar estudiante: ");
                System.out.println("Id estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDao.eliminarEstudiante(estudiante);
                if (eliminado)
                    System.out.println("Estudiante eliminado: "+estudiante);
                else
                    System.out.println("Estudiante no ha sido eliminado: "+estudiante);
            } // fin del caso 5
            case 6 -> {
                System.out.println("Hasta Pronto");
                salir = true;
            }
            default -> System.out.println("Opcion no valida, ingrese otra opcion");
        }
        return salir;
    }

    private static void mostrarMenu() {
        System.out.print("""
                ***** Sistema de estudiantes *****
                1. Liatar estudiantes
                2. Buscar estudiantes
                3. Agregar estudiante
                4. Modificar estudiante
                5. Eliminar estudiante
                6. Salir
                Elige una opcion:
                """);


    }
} // Fin de la clase