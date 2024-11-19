

public class GestionEstudiantes {
    private Estudiante[] estudiantes;
    private int cantidadActual;
    private  int capacidad_Max;

    // Constructor 
    public GestionEstudiantes(int capacidad_Max) {
        this.estudiantes = new Estudiante[capacidad_Max];
        this.cantidadActual = 0;
        this.capacidad_Max = capacidad_Max;
    }

    // Método para agregar un estudiante 
    public void agregarEstudiante(String nombre, int edad, double promedio) {
        if (cantidadActual < capacidad_Max) {
            estudiantes[cantidadActual] = new Estudiante(nombre, edad, promedio);
            cantidadActual++;
        } else {
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }

    // Método para mostrar la lista 
    public void mostrarEstudiantes() {
        if (cantidadActual == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < cantidadActual; i++) {
                estudiantes[i].mostrarInformacion();
                System.out.println("---");
            }
        }
    }

    // Método para buscar un estudiante 
    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadActual; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                estudiantes[i].mostrarInformacion();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Método para calcular el promedio 
    public void calcularPromedioGeneral() {
        if (cantidadActual == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            double sumaPromedios = 0;
            for (int i = 0; i < cantidadActual; i++) {
                sumaPromedios += estudiantes[i].getPromedio();
            }
            double promedioGeneral = sumaPromedios / cantidadActual;
            System.out.println("El promedio general de los estudiantes es: " + promedioGeneral);
        }
        
    }
    
}