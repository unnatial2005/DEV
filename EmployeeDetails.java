// Employee class to hold employee information
class Employee {
    // Instance variables for storing employee details
    private String name;
    private int id;
    private String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Getter and Setter methods for employee details

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the Employee class
public class EmployeeDetails {
    public static void main(String[] args) {
        // Create employee objects using the constructor
        Employee employee1 = new Employee("John Doe", 101, "IT", 55000.50);
        Employee employee2 = new Employee("Jane Smith", 102, "HR", 45000.75);

        // Display employee details
        System.out.println("Employee 1 Details:");
        employee1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        employee2.displayDetails();
    }
}
