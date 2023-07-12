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
        this.id = counter++;
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
}