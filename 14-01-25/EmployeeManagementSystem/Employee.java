class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id +
               ", Name=" + name +
               ", Department=" + department +
               ", Salary=" + salary + "]";
    }
}
