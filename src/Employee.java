public class Employee {

    private String employee;
    private int department;
    private int salary;
    static int id;
    static int counter = 1;

    public Employee (String employee, int department, int salary){
        this.setEmployee(employee);
        this.setDepartment(department);
        this.setSalary(salary);
        id = counter++;
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

    }

    static Employee[] addToArray (Employee[] array, Employee emp){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                array[i] = emp;
                break;
            }
        }
        return array;
    }
    static void printAllNames (Employee[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                System.out.println(array[i].employee);
            }
        }
    }

    public String toString(){
        return "Сотрудник №" + id + " " + getEmployee() + ", отдел №" + getDepartment()
                + ", зарплата сотрудника: " + getSalary();
    }

    static void printAllInfo(Employee[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].toString());
            }
        }
    }

    static int getSummOfSalary(Employee[] array){
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                summ += array[i].getSalary();
            }
        }
        return summ;
    }

    static int getAverageOfSalary(Employee[] array){
        return  getSummOfSalary(array) / array.length;
    }
}