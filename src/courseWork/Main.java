package courseWork;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Катуков Василий Илларионович", 3, 5000);
        Employee emp2 = new Employee("Хлебникова Екатерина Ивановна", 1, 8500);
        Employee emp3 = new Employee("Чуков Денис Олегович", 5, 3750);
        Employee emp4 = new Employee("Салькова Ольга Николаевна", 5, 4250);

        Employee.addToArray(Employee.employeesArray, emp1);
        Employee.addToArray(Employee.employeesArray, emp2);
        Employee.addToArray(Employee.employeesArray, emp3);
        Employee.addToArray(Employee.employeesArray, emp4);

        Employee.printAllNames(Employee.employeesArray);
        Employee.printAllInfo(Employee.employeesArray);

        Employee.getSummOfSalary(Employee.employeesArray);
        Employee.findMaxSalary(Employee.employeesArray);
        Employee.findMinSalary(Employee.employeesArray);

        System.out.println("\nСреднее значение зарплат сотрудников равно " + Employee.getAverageOfSalary(Employee.employeesArray));
//        indexAllSalary(Employee.employeesArray);
//        printAllInfo(Employee.employeesArray);
//
//        findMaxSalary(Employee.employeesArray, 5);
//        findMinSalary(Employee.employeesArray, 5);
//
//        System.out.println("\nСумма зарплат сотрудников выбранного отдела равно " + Employee.getSummOfSalary(Employee.employeesArray, 5));
//        System.out.println("\nСреднее значение зарплат выбранного отдела равно " + Employee.getAverageOfSalary(Employee.employeesArray, 5));
//
//        indexAllSalary(Employee.employeesArray, 5, 30);
//        printAllInfo(Employee.employeesArray, 5);
//
//        printAllMinEmployees(Employee.employeesArray, 6000);
//        printAllMaxEmployees(Employee.employeesArray, 6000);

        Employee.imputNumber();
    }
}
