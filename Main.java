import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionEstudiantes gestionEstudiantes = new GestionEstudiantes(6);

        while (true) {
            
            System.out.println("MENÚ GESTIÓN ESTUDIANTES");
            System.out.println(" ");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar Estudiante por Nombre");
            System.out.println("4. Calcular el promedio general");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("SELECCIONAR UNA OPCION: ");
            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingresar nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingresar edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingresar promedio: ");
                    double promedio = sc.nextDouble();
                    sc.nextLine(); 
                    gestionEstudiantes.agregarEstudiante(nombre, edad, promedio);
                    break;
                case 2:
                    gestionEstudiantes.mostrarEstudiantes();
                    break;
                case 3:
                    System.out.print("Ingresar nombre del estudiante a buscar: ");
                    String nombreBusqueda = sc.nextLine();
                    gestionEstudiantes.buscarPorNombre(nombreBusqueda);
                    break;
                case 4:
                    gestionEstudiantes.calcularPromedioGeneral();
                    break;
                case 5:
                    System.out.println("SALIR...");
                    sc.close();
                    return;
                default:
                    System.out.println("OpcióN invalida...");
            }
        }
    }
}
