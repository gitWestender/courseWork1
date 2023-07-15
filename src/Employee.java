public class Employee {

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

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[10];
        Employee emp1 = new Employee("Катуков Василий Илларионович", 3, 5000);
        Employee emp2 = new Employee("Хлебникова Екатерина Ивановна", 1, 8500);
        Employee emp3 = new Employee("Чуков Денис Олегович", 5, 3750);
        Employee emp4 = new Employee("Салькова Ольга Николаевна", 5, 4250);

        addToArray(employeesArray, emp1);
        addToArray(employeesArray, emp2);
        addToArray(employeesArray, emp3);
        addToArray(employeesArray, emp4);

        printAllNames(employeesArray);
        printAllInfo(employeesArray);

        getSummOfSalary(employeesArray);
        findMaxSalary(employeesArray);
        findMinSalary(employeesArray);

        System.out.println("\nСреднее значение зарплат сотрудников равно " + getAverageOfSalary(employeesArray));

        indexAllSalary(employeesArray);
        printAllInfo(employeesArray);

        findMaxSalary(employeesArray, 5);
        findMinSalary(employeesArray, 5);

        System.out.println("\nСумма зарплат сотрудников выбранного отдела равно " + getSummOfSalary(employeesArray, 5));
        System.out.println("\nСреднее значение зарплат выбранного отдела равно " + getAverageOfSalary(employeesArray, 5));

        indexAllSalary(employeesArray, 5, 30);
        printAllInfo(employeesArray, 5);
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

    @Override
    public String toString() {
        return "Сотрудник №" + id + " " + getEmployee() + ", отдел №" + getDepartment()
                + ", зарплата сотрудника: " + getSalary();
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
            if (array[i] != null && array[i].department == department){
                idCount++;
            }
        }
        return getSummOfSalary(array, department) / idCount;
    }

    static void indexSalary(Employee emp, int percent) {
        emp.salary += emp.salary * (percent/100f);
    }

    static void indexAllSalary(Employee[] array, int department, int percent) {
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != null && array[j].department == department){
                indexSalary(array[j], percent);
                i++;
            }
        }
    }

    static void printAllInfo(Employee[] array, int department) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].department == department) {
                System.out.printf("Сотрудник №%d %s, зарплата сотрудника: %d \n", array[i].id, array[i].employee, array[i].salary);
            }
        }
    }
}