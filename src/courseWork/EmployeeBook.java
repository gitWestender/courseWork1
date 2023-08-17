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
    public void printBook(EmployeeBook eBook) {
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    //Метод который выводить имена сотрудников из книги
    void printAllNames(EmployeeBook eBook) {
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

    //Метод для подсчета общей суммы зарплат сотрудников
    public int getSummOfSalary(EmployeeBook eBook) {
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                summ += employees[i].getSalary();
            }
        }
        return summ;
    }

    //Метод для подсчета среднего значения зарплат сотрудников
    public int getAverageOfSalary(EmployeeBook eBook) {
        return getSummOfSalary(eBook) / eBook.getEmployees().length;
    }

    //Метод для нахождения сотрудника с наибольшей зарплатой (по всей книге)
    public void findMaxSalary(EmployeeBook eBook) {
        float result = Integer.MIN_VALUE;
        int id = 0;

        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getSalary() > result) {
                result = eBook.getEmployees()[i].getSalary();
                id = eBook.getEmployees()[i].getId();
            }
        }

        System.out.println("\nСотрудник №" + id + " имеет максимальную зарплату равную " + result);
    }

    //Метод для нахождения сотрудника с наименьшей зарплатой (по всей книге)
    static void findMinSalary(EmployeeBook eBook) {
        float result = Integer.MAX_VALUE;
        int id = 0;

        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getSalary() < result) {
                result = eBook.getEmployees()[i].getSalary();
                id = eBook.getEmployees()[i].getId();
            }
        }

        System.out.println("\nСотрудник №" + id + " имеет минимальную зарплату равную " + result);
    }

    //Метод индексирующий зарплату выбранного сотрудника на 10%
    public void indexSalary(EmployeeBook eBook, Employee emp) {
        emp.setSalary(emp.getSalary() + emp.getSalary() * 0.1f);
    }

    ////Метод индексирующий зарплату всех сотрудников на 10%
    public void indexAllSalary(EmployeeBook eBook) {
        int i = 0;
        while (eBook.getEmployees()[i] != null) {
            indexSalary(eBook, eBook.getEmployees()[i]);
            i++;
        }
    }
}
