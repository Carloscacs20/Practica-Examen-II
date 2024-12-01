public class Professor {
    private String name;
    private Department department; // Relación 1 (cada Professor pertenece a un Department)

    public Professor(String name){
        this.name = name;
    }

    // Asignar el departamento al profesor

    public void setDepartment(Department department){
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName(){
        return name;
    }
}
