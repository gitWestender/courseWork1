package courseWork;

import java.util.Objects;

public class Employee {

    private String employee;
    private int department;
    private float salary;
    private int id;
    private static int counter = 1;

    public Employee(String employee, int department, int salary) {
        this.setEmployee(employee);
        this.setDepartment(department);
        this.setSalary(salary);
        this.setId(getCounter());
        setCounter(getCounter() + 1);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter++;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        if (employee != null)
            this.employee = employee;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        if (department > 0 && department < 6)
            this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static Employee[] employeesArray = new Employee[10];

    @Override
    public String toString() {
        return "Сотрудник №" + id + " " + getEmployee() + ", отдел №" + getDepartment()
                + ", зарплата сотрудника: " + getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return department == employee1.department && Float.compare(salary, employee1.salary) == 0 && id == employee1.id && Objects.equals(employee, employee1.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, department, salary, id);
    }
}