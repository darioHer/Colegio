import java.util.ArrayList;
import java.util.List;

class ListaEstudiante {
    List<Estudiante> estudiantes;

    public ListaEstudiante() {
        estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 20, 101L, 4.5));
        estudiantes.add(new Estudiante("María", 22, 102L, 4.1));
        estudiantes.add(new Estudiante("Carlos", 21, 103L, 3.8));
        estudiantes.add(new Estudiante("Rosa", 23, 101L, 4.5));
        estudiantes.add(new Estudiante("Luisa", 24, 102L, 4.1));
        estudiantes.add(new Estudiante("Camila", 21,103L, 3.8));
    }
}