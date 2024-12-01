import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    private String address;
    private String phone;
    private List<Department> departments; // Relación 1..* (un College puede tener múltiples Department)
    private List<Student> students; // Relación *..* (un College puede tener múltiples Student)

    public College(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departments = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Metodo para manejar a estudiantes

    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(Student student){
        students.remove(student);
    }

    // Metodo para manejar departamentos

    public void addDepartment(Department department){
        departments.add(department);
    }

    public void deleteDepartment(Department department){
        departments.remove(department);
    }
    public Department getDepartment(int index){
        return departments.get(index);
    }

    public String getName(){
        return name;
    }

}
