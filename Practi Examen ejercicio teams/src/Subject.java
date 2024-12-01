import java.util.ArrayList;
import java.util.List;

class Subject {
    private String name;
    private String subjectId;
    private List<Student> students; // Relación *..* (un Subject puede ser tomado por múltiples Student)

    // Constructor
    public Subject(String name, String subjectId) {
        this.name = name;
        this.subjectId = subjectId;
        this.students = new ArrayList<>(); // Inicializamos la lista
    }

    // Método para agregar estudiantes
    public void addStudent(Student student) {
        students.add(student); // Agregar estudiante a la lista
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

