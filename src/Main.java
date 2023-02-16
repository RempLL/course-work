
public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        //Получить список всех сотрудников со всеми имеющимися по ним данными
        employeeBook.soutEmployee();

        //Посчитать сумму затрат на зарплаты в месяц.
        System.out.println(employeeBook.calculationMonthlySalaryAll());

        //Найти сотрудника с минимальной зарплатой.
        System.out.println(employeeBook.findEmployeeMinSalaryAll());

        //Найти сотрудника с максимальной зарплатой.
        System.out.println(employeeBook.findEmployeeMaxSalaryAll());

        //Подсчитать среднее значение зарплат.
        System.out.println(employeeBook.averageValueSalaryAll());

        //Получить Ф. И. О. всех сотрудников.
        employeeBook.soutFullName();


        System.out.println("Повышенная сложность:");
        //Повышенная сложность
        //Проиндексировать зарплату.
        employeeBook.indexSalaryAll(10);
        employeeBook.soutEmployee();

        //Параметр номер отдела.Сотрудника с минимальной зарплатой.
        System.out.println(employeeBook.findEmployeeMinSalary(1));

        //Параметр номер отдела.Сотрудника с максимальной зарплатой.
        System.out.println(employeeBook.findEmployeeMaxSalary(2));

        //Сумму затрат на зарплату по отделу.
        System.out.println(employeeBook.calculationMonthlySalary(1));

        //Среднюю зарплату по отделу.
        System.out.println(employeeBook.averageValueSalary(4));

        //Проиндексировать зарплату всех сотрудников отдела на процент,
        // который приходит в качестве параметра.
        employeeBook.indexSalary(1, 10);
        employeeBook.soutEmployee();

        //Напечатать всех сотрудников отдела (все данные, кроме отдела).
        employeeBook.soutEmployeeDepartment(5);

        //Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа.
        employeeBook.findEmployeesWithSalaryLess(100000);

        //Получить в качестве параметра число и найти всех сотрудников с зарплатой больше числа.
        employeeBook.findEmployeesWithSalaryMore(100000);

        //Очень сложно
        System.out.println("Очень сложно");
        //Удалить по имени
        employeeBook.deleteEmployeeFullName("Андрей А.К.");
        //Удалить по id
        employeeBook.deleteEmployeeId(9);
        //Добавить сотрудника
        employeeBook.addEmployee(new Employee("Витек А.К.", 4, 777_777));

        //Изменить зарплату
        employeeBook.changeSalary("Дмитрий П.К.", 140000);

        //Изменить отдел
        employeeBook.changeDepartment("Федор В.К.", 4);

        //Получить Ф. И. О. всех сотрудников по отделам
        employeeBook.getFioByDepartment();
    }
}