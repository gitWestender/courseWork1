package courseWork;

import java.util.Arrays;

public class EmployeeBook {

    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    //Метод добавляющий сотрудника на первое незанятое в книге место
    public Employee[] addToBook(Employee[] employees, Employee emp) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = emp;
                break;
            }
        }
        return employees;
    }

    //Метод который выводить полную информацию о сотрудниках из книги
    public void printBook(EmployeeBook emp) {
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    //Метод который выводить имена сотрудников из книги
    void printAllNames(EmployeeBook emp) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getEmployee());
            }
        }
    }

    //Метод создающий больший массив для хранения информации о сотрудниках
    public Employee[] createLargerArray(Employee[] employees) {
        return Arrays.copyOf(employees, employees.length + 1);
    }
}
