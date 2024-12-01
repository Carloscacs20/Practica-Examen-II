import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String studentid;
    private List<Subject> subjects; // Relación *..* (un Student puede estar inscrito en múltiples Subject)

    public Student(String name, String studentid) {
        this.name = name;
        this.studentid = studentid;
        this.subjects = new ArrayList<>(); // Inicializamos la lista
    }

    // Método para agregar una asignatura al estudiante
    public void addSubject(Subject subject) {
        subjects.add(subject);          // Agregar asignatura a la lista del estudiante
        subject.addStudent(this);       // Relación bidireccional
    }

    public void removeSubject(Subject subject) {
        subjects.remove(subject);
        subject.removeStudent(this);    // Relación bidireccional
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}
