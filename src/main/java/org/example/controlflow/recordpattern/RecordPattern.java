import java.util.List;

record Department(String name, List<Employee> employees) {}
record Employee(String name, String position) {}

public void main() {
    List<Department> departments = List.of(
            new Department("IT", List.of(new Employee("Alice", "Developer"),
                                               new Employee("Bob", "Architect"))),
            new Department("HR", List.of(new Employee("Charlie", "Recruiter")))
    );

    departments.stream()
            .flatMap(dept -> dept.employees().stream())
            .filter(emp -> emp instanceof Employee(String name, String position) && position.equals("Developer"))
            .forEach(emp -> System.out.println(emp.name()));
}