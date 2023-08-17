package courseWork;

import java.util.Scanner;

public class Employee {

    static Scanner scanner = new Scanner(System.in);

    private String employee;
    private int department;
    private float salary;
    private int id;
    static int counter = 1;

    public Employee(String employee, int department, int salary) {
        this.setEmployee(employee);
        this.setDepartment(department);
        this.setSalary(salary);
        this.setId(counter++);
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
}