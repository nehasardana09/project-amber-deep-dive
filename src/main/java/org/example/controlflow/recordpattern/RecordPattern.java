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
            //use var in one parameter and not another?
            .filter(emp -> emp instanceof Employee(var _, var position) && position.equals("Developer"))
            .forEach(emp -> System.out.println(emp.name()));
}