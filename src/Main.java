import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera = new ListaCarrera();

        // Calcular promedio de notas y edades por carrera
        Map<Long, Double> promedioNotasPorCarrera = new HashMap<>();
        Map<Long, Double> promedioEdadesPorCarrera = new HashMap<>();
        Map<Long, Integer> contadorEstudiantesPorCarrera = new HashMap<>();

        for (Estudiante estudiante : listaEstudiante.estudiantes) {
            promedioNotasPorCarrera.put(estudiante.carrera, promedioNotasPorCarrera.getOrDefault(estudiante.carrera, 0.0) + estudiante.promedio);
            promedioEdadesPorCarrera.put(estudiante.carrera, promedioEdadesPorCarrera.getOrDefault(estudiante.carrera, 0.0) + estudiante.edad);
            contadorEstudiantesPorCarrera.put(estudiante.carrera, contadorEstudiantesPorCarrera.getOrDefault(estudiante.carrera, 0) + 1);
        }

        for (Long codigoCarrera : promedioNotasPorCarrera.keySet()) {
            double promedioNotas = promedioNotasPorCarrera.get(codigoCarrera) / contadorEstudiantesPorCarrera.get(codigoCarrera);
            double promedioEdades = promedioEdadesPorCarrera.get(codigoCarrera) / contadorEstudiantesPorCarrera.get(codigoCarrera);
            System.out.println("Carrera: " + obtenerNombreCarrera(codigoCarrera, listaCarrera) +
                    ", Promedio de notas: " + promedioNotas +
                    ", Promedio de edades: " + promedioEdades);
        }
    }

    private static String obtenerNombreCarrera(Long codigoCarrera, ListaCarrera listaCarrera) {
        for (Carrera carrera : listaCarrera.carreras) {
            if (carrera.codigo.equals(codigoCarrera)) {
                return carrera.nombre;
            }
        }
        return "Carrera no encontrada";
    }
}