/* wap to such that there is list of employee with name and salary
and try to fetch the value whose name start with g and salary is
greater than 60000.*/

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class salarywithEmployee {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("George", 75000));
        employees.add(new Employee("ankur", 50000));
        employees.add(new Employee("Rohan", 65000));
        employees.add(new Employee("Gina", 55000));
        employees.add(new Employee("Gordon", 80000));
        
        // Loop through the list and fetch employees that start with "G" and salary > 60000
        System.out.println("Employees starting with 'G' and salary > 60000:");
        for (Employee employee : employees) {
            if (employee.getName().startsWith("G") && employee.getSalary() > 60000) {
                System.out.println(employee.getName() + " - Salary: " + employee.getSalary());
            }
        }
    }
}
