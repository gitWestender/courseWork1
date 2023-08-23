package courseWork;

import java.util.Arrays;
import java.util.Scanner;

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
    public void printAllNames(EmployeeBook eBook) {
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
    public double getAverageOfSalary(EmployeeBook eBook) {
        int count = 0;
        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null) {
                count++;
            } else {
                continue;
            }
        }
        return getSummOfSalary(eBook) / count;
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
    public void findMinSalary(EmployeeBook eBook) {
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

    // Метод для нахождения максимальной зарплаты по отделу
    public void findMaxSalary(EmployeeBook eBook, int department) {
        float result = Integer.MIN_VALUE;
        int id = 0;

        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getSalary() > result && eBook.getEmployees()[i].getDepartment() == department) {
                result = eBook.getEmployees()[i].getSalary();
                id = eBook.getEmployees()[i].getId();
            }
        }

        System.out.println("\nСотрудник отдела №" + department + " c ID " + id + " имеет максимальную зарплату равную " + result);
    }

    // Метод для нахождения минимальной зарплаты по отделу
    public void findMinSalary(EmployeeBook eBook, int department) {
        float result = Integer.MAX_VALUE;
        int id = 0;

        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getSalary() < result && eBook.getEmployees()[i].getDepartment() == department) {
                result = eBook.getEmployees()[i].getSalary();
                id = eBook.getEmployees()[i].getId();
            }
        }

        System.out.println("\nСотрудник отдела №" + department + " c ID " + id + " имеет минимальную зарплату равную " + result);
    }

    // Метод для нахождения суммы зарплат по отделу
    public int getSummOfSalary(EmployeeBook eBook, int department) {
        int summ = 0;
        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getDepartment() == department) {
                summ += eBook.getEmployees()[i].getSalary();
            }
        }
        return summ;
    }

    // Метод для нахождения среднего значения зарплаты по отделу
    public int getAverageOfSalary(EmployeeBook eBook, int department) {
        int idCount = 0;
        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getDepartment() == department) {
                idCount++;
            }
        }
        return getSummOfSalary(eBook, department) / idCount;
    }

    // Метод для индексации зарплаты сотрудника на выбранный процент
    public void indexSalary(Employee emp, int percent) {
        emp.setSalary(emp.getSalary() + emp.getSalary() * (percent / 100f));
    }

    // Метод для индексации зарплаты, сотрудников отдела на выбранный процент
    public void indexAllSalary(EmployeeBook eBook, int department, int percent) {
        for (int j = 0; j < eBook.getEmployees().length; j++) {
            if (eBook.getEmployees()[j] != null && eBook.getEmployees()[j].getDepartment() == department) {
                indexSalary(eBook.getEmployees()[j], percent);
            }
        }
    }

    // Метод для вывода информации о сотрудниках в отделе
    public void printAllInfo(EmployeeBook eBook, int department) {
        System.out.println("\nВсе сотрудники выбранного отдела (" + department + "):");
        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getDepartment() == department) {
                System.out.printf("Сотрудник №%d %s, зарплата сотрудника: %d \n",
                        eBook.getEmployees()[i].getId(), eBook.getEmployees()[i].getEmployee(), eBook.getEmployees()[i].getSalary());
            }
        }
    }

    // Метод для нахождения сотрудников с зарплатой меньше указанной
    public void printAllMinEmployees(EmployeeBook eBook, int salary) {
        System.out.println("\nСотрудники с запралтой меньше указанной (" + salary + "):");
        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getSalary() < salary) {
                System.out.printf("Сотрудник №%d %s, зарплата сотрудника: %d \n",
                        eBook.getEmployees()[i].getId(), eBook.getEmployees()[i].getEmployee(), eBook.getEmployees()[i].getSalary());
            }
        }
    }

    // Метод для нахождения сотрудников с зарплатой больше указанной
    public void printAllMaxEmployees(EmployeeBook eBook, int salary) {
        System.out.println("\nСотрудники с зарплатой выше и равной указанной (" + salary + "):");
        for (int i = 0; i < eBook.getEmployees().length; i++) {
            if (eBook.getEmployees()[i] != null && eBook.getEmployees()[i].getSalary() >= salary) {
                System.out.printf("Сотрудник №%d %s, зарплата сотрудника: %d \n",
                        eBook.getEmployees()[i].getId(), eBook.getEmployees()[i].getEmployee(), eBook.getEmployees()[i].getSalary());
            }
        }
    }


    // Куммулятивный метод для выбранного отдела
    public void imputNumber(EmployeeBook eBook) {
        System.out.println("Введите целое число. Если ввели от 1 до 5 произведем действия с отделами." +
                " Если ввели от 1000 и больше произведем действия с зарплатой.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 0 || (number > 5 && number < 1000)) {
            System.out.println("Некоректное число. Попробуйте снова");
        } else if (number > 0 && number < 6) {
            System.out.println("Выполняем действия с отделом №" + number);
            System.out.println("Ведите целочисленное число-процент, для индексации зарплаты по отделу");
            int percent = scanner.nextInt();
            scanner.close();
            departmentMethods(eBook, number, percent);
        } else {
            System.out.println("Выполняем действия с зарплатой.");
            salaryMethods(eBook, number);
        }

    }

    // Метод для нахождения сотрудников с зарплатой меньше и больше указанной
    public void salaryMethods(EmployeeBook eBook, int salary) {
        printAllMinEmployees(eBook, salary);
        printAllMaxEmployees(eBook, salary);
    }

    // Метод для выполнения действий с отделом
    public void departmentMethods(EmployeeBook eBook, int number, int percent) {
        indexAllSalary(eBook);
        printAllInfo(eBook, number);

        findMaxSalary(eBook, number);
        findMinSalary(eBook, number);

        System.out.println("\nСумма зарплат сотрудников выбранного отдела равно " + getSummOfSalary(eBook, number));
        System.out.println("\nСреднее значение зарплат выбранного отдела равно " + getAverageOfSalary(eBook, number));

        indexAllSalary(eBook, number, percent);
        printAllInfo(eBook, number);
    }

    //метод для удаления сотрудника из книги по его ФИО
    public Employee[] deleteFromBook(Employee[] array, String fullname) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && fullname.equals(array[i].getEmployee())) {
                array[i] = null;
            }
        }
        return array;
    }

    //метод для удаления сотрудника из книги по его ID
    public Employee[] deleteFromBook(Employee[] array, int id) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && id == array[i].getId()) {
                array[i] = null;
            }
        }
        return array;
    }

    //Метод для изменения сотрудника, полученного по ФИО
    public void changeEmployee (Employee[] array, String fullname) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите, что вы хотите сделать:");
        System.out.println("[1] - Изменить зарплату" + "\n[2] - Изменить отдел");

        int input = scanner.nextInt();
        if (input == 1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && fullname.equals(array[i].getEmployee())) {
                    changeEmployeeSalary(array[i]);
                }
            }
        }
        if (input == 2) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && fullname.equals(array[i].getEmployee())) {
                    changeEmployeeID(array[i]);
                }
            }
        }
    }

    ////Метод для изменения сотрудника, полученного по ID
    public void changeEmployee (Employee[] array, int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите, что вы хотите сделать:");
        System.out.println("[1] - Изменить зарплату" + "\n[2] - Изменить отдел");

        int input = scanner.nextInt();
        if (input == 1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && id == array[i].getId()) {
                    changeEmployeeSalary(array[i]);
                }
            }
        }
        if (input == 2) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && id == array[i].getId()) {
                    changeEmployeeID(array[i]);
                }
            }
        }
    }

    //Метод для изменения зарплаты сотрудника
    public void changeEmployeeSalary(Employee emp) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите каккую заплату нужно назначить сотруднику: ");

        int newSalary = scanner.nextInt();
        emp.setSalary(newSalary);
    }

    ////Метод для изменения отдела сотрудника
    public void changeEmployeeID(Employee emp) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите в какой отдел нужно назначить сотруднику: ");

        int newDepartment = scanner.nextInt();
        if (newDepartment > 0 && newDepartment < 6) {
            emp.setDepartment(newDepartment);
        } else {
            System.out.println("Такого отдела не существует");
        }
    }
}
