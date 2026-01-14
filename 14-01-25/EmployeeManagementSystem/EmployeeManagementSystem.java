import java.util.Scanner;

public class EmployeeManagementSystem {

    static Employee[] employees = new Employee[20];
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by ID");
            System.out.println("6. Count Employees by Department");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addEmployee(sc);
                case 2 -> displayEmployees();
                case 3 -> updateEmployee(sc);
                case 4 -> deleteEmployee(sc);
                case 5 -> searchEmployee(sc);
                case 6 -> countByDepartment(sc);
                case 7 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }

    // 1. Add Employee
    static void addEmployee(Scanner sc) {
        if (count >= employees.length) {
            System.out.println("Employee limit reached!");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee temp = new Employee(id, "", "", 0);

        for (int i = 0; i < count; i++) {
            if (employees[i].equals(temp)) {
                System.out.println("Employee with ID " + id + " already exists! Cannot add duplicate.");
                return;
            }
        }

        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count++] = new Employee(id, name, department, salary);
        System.out.println("Employee added successfully!");

        displayEmployees();
    }

    // 2. Display Employees
    static void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("\nCurrent Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + employees[i]);
        }
    }

    // 3. Update Employee
    static void updateEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                sc.nextLine();

                System.out.print("Enter new Name: ");
                employees[i].name = sc.nextLine();

                System.out.print("Enter new Department: ");
                employees[i].department = sc.nextLine();

                System.out.print("Enter new Salary: ");
                employees[i].salary = sc.nextDouble();

                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // 4. Delete Employee
    static void deleteEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // 5. Search Employee
    static void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                System.out.println("Found Employee:");
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // 6. Count Employees by Department
    static void countByDepartment(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter Department to count: ");
        String dept = sc.nextLine();

        int deptCount = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].department.equalsIgnoreCase(dept)) {
                deptCount++;
            }
        }
        System.out.println("Number of employees in " + dept + ": " + deptCount);
    }
}
