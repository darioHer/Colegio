import java.util.ArrayList;
import java.util.List;

class ListaCarrera {
    List<Carrera> carreras;

    public ListaCarrera() {
        carreras = new ArrayList<>();
        carreras.add(new Carrera(101L, "Ingeniería de Sistemas"));
        carreras.add(new Carrera(102L, "Ingeniería Industrial"));
        carreras.add(new Carrera(103L, "Matemáticas"));
    }
}
