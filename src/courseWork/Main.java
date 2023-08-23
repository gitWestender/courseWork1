package courseWork;

//Привести структуру проекта к ООП.
//
//        1. Создать класс EmployeeBook.
//        2. Перенести хранилище сотрудников в него (массив), закрыть к нему доступ извне (сделать приватным).
//        3. Все статические методы по работе с массивом перенести в этот класс и сделать нестатическими.
//        4. Добавить несколько новых методов:
//        1. Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
//        Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее. Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.
//        2. Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
//        5. Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
//        1. Изменить зарплату.
//        2. Изменить отдел.
//        Придумать архитектуру. Сделать или два метода, или один, но продумать его.
//        6. Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Катуков Василий Илларионович", 3, 5000);
        Employee emp2 = new Employee("Хлебникова Екатерина Ивановна", 1, 8500);
        Employee emp3 = new Employee("Чуков Денис Олегович", 5, 3750);
        Employee emp4 = new Employee("Салькова Ольга Николаевна", 5, 4250);

        EmployeeBook eBook = new EmployeeBook();

        eBook.addToBook(eBook.getEmployees(), emp1);
        eBook.addToBook(eBook.getEmployees(), emp2);
        eBook.addToBook(eBook.getEmployees(), emp3);
        eBook.addToBook(eBook.getEmployees(), emp4);


    }
}
