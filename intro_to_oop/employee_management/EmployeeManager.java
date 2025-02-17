package intro_to_oop.employee_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeManager {
    List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public Optional<Employee> getEmployeeById(int id) {
        return this.employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst();
    }

    public void getEmployees() {
        for (Employee employee: employees) {
            employee.displayEmployeePersonalInfo();
        }
    }
}
