public class Test {
    public static void main(String[] args) {
        // Create an EmployeeManager with a capacity of 5 employees
        System.out.println();
        EmployeeManager manager = new EmployeeManager(5);

        // Create some employees
        Employee emp1 = new Employee(21, "David", "System Analyst", 50000);
        Employee emp2 = new Employee(22, "Bob", "Designer", 70000);
        Employee emp3 = new Employee(23, "Jack", "Analyst", 60000);

        // Add employees to the manager
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        // Traverse and display employees
        System.out.println("Employees after adding:");
        manager.traverseEmployees();

        // Search for an employee
        Employee searchedEmployee = manager.searchEmployee(2);
        System.out.println("Searched Employee with ID 2: " + searchedEmployee);

        // Delete an employee
        boolean isDeleted = manager.deleteEmployee(1);
        System.out.println("Employee with ID 1 deleted: " + isDeleted);

        // Display employees after deletion
        System.out.println("Employees after deletion:");
        manager.traverseEmployees();

        // Attempt to add an employee after reaching capacity
        Employee emp4 = new Employee(4, "Diana", "Designer", 55000);
        manager.addEmployee(emp4);

        // Display employees after adding a new employee
        System.out.println("Employees after adding a new employee:");
        manager.traverseEmployees();
    }
}

