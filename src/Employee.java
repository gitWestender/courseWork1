public class Employee {

    private String employee;
    private int department;
    private int salary;
    static int id;
    static int counter;

    public Employee (String employee, int department, int salary, int id){
        this.setEmployee(employee);
        this.setDepartment(department);
        this.setSalary(salary);
        this.id = id;
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
    }
}