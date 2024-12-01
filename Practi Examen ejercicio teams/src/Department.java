import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors; // Relación 1..* (un Department puede tener múltiples Professor)
    private Professor director; // Relación 0..1 (un Department puede tener un director opcional)

    public Department(String name){
        this.name = name;
        this.professors = new ArrayList<>();
        this.director = null; // Inicialmente sin director
    }

    // Metodo para manejar profesores

    public void addProfessor(Professor professor){
        professors.add(professor);
    }

    public void deleteProfessor(Professor professor){
        professors.remove(professor);
    }

    public Professor getProfessor(int index){
        return professors.get(index);
    }

    public void setDirector(Professor director) { //  Asignar director (relación 0..1)
        this.director = director;
    }

    public Professor getDirector(){
        return director;
    }
}
