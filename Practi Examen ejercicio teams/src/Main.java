//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        College college = new College("Mamitas Puebla", "mamitas.puebla@edu.pt.es","09866913");

        Department cs = new Department("Computer Science");
        college.addDepartment(cs);
        // Crear profesor y asignarlo al departamento
        Professor professor = new Professor("Julio Zolano");
        cs.addProfessor(professor);
        cs.setDirector(professor);

        Student student = new Student("Pacheco", "169");
        Subject sub = new Subject("Fundamentos de TI", "105s");
        // Relación bidireccional entre estudiante y asignatura
        student.addSubject(sub);
        sub.addStudent(student);

        System.out.println("College: " + college.getName());
        System.out.println("Director: " + college.getDepartment(0).getDirector().getName());
        System.out.println("Student " + student.getName() + " is taking " + student.getSubjects().get(0).getName());
    }
}