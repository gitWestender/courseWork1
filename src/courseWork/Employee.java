package courseWork;

import java.util.Scanner;

public class Employee {

    static Scanner scanner = new Scanner(System.in);

    private String employee;
    private int department;
    private int salary;
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
        this.employee = employee;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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


    static Employee[] addToArray(Employee[] array, Employee emp) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = emp;
                break;
            }
        }
        return array;
    }

    static void printAllNames(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].employee);
            }
        }
    }

    static void printAllInfo(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].toString());
            }
        }
    }

    static int getSummOfSalary(Employee[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                summ += array[i].getSalary();
            }
        }
        return summ;
    }

    static int getAverageOfSalary(Employee[] array) {
        return getSummOfSalary(array) / array.length;
    }

    static void findMaxSalary(Employee[] array) {
        int result = Integer.MIN_VALUE;
        int id = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].salary > result) {
                result = array[i].salary;
                id = array[i].getId();
            }
        }

        System.out.println("\nСотрудник №" + id + " имеет максимальную зарплату равную " + result);
    }

    static void findMinSalary(Employee[] array) {
        int result = Integer.MAX_VALUE;
        int id = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].salary < result) {
                result = array[i].salary;
                id = array[i].getId();
            }
        }

        System.out.println("\nСотрудник №" + id + " имеет минимальную зарплату равную " + result);
    }

    static void indexSalary(Employee emp) {
        emp.salary += emp.salary * 0.1f;
    }

    static void indexAllSalary(Employee[] array) {
        int i = 0;
        while (array[i] != null) {
            indexSalary(array[i]);
            i++;
        }
    }

    // Перегружаем методы и выполняем задания Повышенной сложности
    static void findMaxSalary(Employee[] array, int department) {
        int result = Integer.MIN_VALUE;
        int id = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].salary > result && array[i].department == department) {
                result = array[i].salary;
                id = array[i].getId();
            }
        }

        System.out.println("\nСотрудник отдела №" + department + " c ID " + id + " имеет максимальную зарплату равную " + result);
    }

    static void findMinSalary(Employee[] array, int department) {
        int result = Integer.MAX_VALUE;
        int id = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].salary < result && array[i].department == department) {
                result = array[i].salary;
                id = array[i].getId();
            }
        }

        System.out.println("\nСотрудник отдела №" + department + " c ID " + id + " имеет минимальную зарплату равную " + result);
    }

    static int getSummOfSalary(Employee[] array, int department) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].department == department) {
                summ += array[i].getSalary();
            }
        }
        return summ;
    }

    static int getAverageOfSalary(Employee[] array, int department) {
        int idCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].department == department) {
                idCount++;
            }
        }
        return getSummOfSalary(array, department) / idCount;
    }

    static void indexSalary(Employee emp, int percent) {
        emp.salary += emp.salary * (percent / 100f);
    }

    static void indexAllSalary(Employee[] array, int department, int percent) {
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != null && array[j].department == department) {
                indexSalary(array[j], percent);
                i++;
            }
        }
    }

    static void printAllInfo(Employee[] array, int department) {
        System.out.println("\nВсе сотрудники выбранного отдела (" + department + "):");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].department == department) {
                System.out.printf("Сотрудник №%d %s, зарплата сотрудника: %d \n", array[i].id, array[i].employee, array[i].salary);
            }
        }
    }

    static void printAllMinEmployees(Employee[] array, int salary) {
        System.out.println("\nСотрудники с запралтой меньше указанной (" + salary + "):");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].salary < salary) {
                System.out.printf("Сотрудник №%d %s, зарплата сотрудника: %d \n", array[i].id, array[i].employee, array[i].salary);
            }
        }
    }

    static void printAllMaxEmployees(Employee[] array, int salary) {
        System.out.println("\nСотрудники с зарплатой выше и равной указанной (" + salary + "):");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].salary >= salary) {
                System.out.printf("Сотрудник №%d %s, зарплата сотрудника: %d \n", array[i].id, array[i].employee, array[i].salary);
            }
        }
    }

    static void imputNumber() {
        System.out.println("Введите целое число. Если ввели от 1 до 5 произведем действия с отделами." +
                " Если ввели от 1000 и больше произведем действия с зарплатой.");
        int number = scanner.nextInt();

        if (number <= 0 || (number > 5 && number < 1000)) {
            System.out.println("Некоректное число. Попробуйте снова");
        } else if (number > 0 && number < 6) {
            System.out.println("Выполняем действия с отделом №" + number);
            System.out.println("Ведите целочисленное число-процент, для индексации зарплаты по отделу");
            int percent = scanner.nextInt();
            scanner.close();
            departmentMethods(number, percent);
        } else {
            System.out.println("Выполняем действия с зарплатой.");
            salaryMethods(number);
        }

    }

    static void salaryMethods(int salary) {
        printAllMinEmployees(employeesArray, salary);
        printAllMaxEmployees(employeesArray, salary);
    }

    static void departmentMethods(int number, int percent) {
        indexAllSalary(employeesArray);
        printAllInfo(employeesArray);

        findMaxSalary(employeesArray, number);
        findMinSalary(employeesArray, number);

        System.out.println("\nСумма зарплат сотрудников выбранного отдела равно " + getSummOfSalary(employeesArray, 5));
        System.out.println("\nСреднее значение зарплат выбранного отдела равно " + getAverageOfSalary(employeesArray, 5));

        indexAllSalary(employeesArray, number, percent);
        printAllInfo(employeesArray, number);
    }
}