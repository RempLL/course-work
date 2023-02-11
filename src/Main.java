public class Main {

    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Альберт Н.И.",1,100000);
        employee[1] = new Employee("Виктор А.В.",1,90000);
        employee[2] = new Employee("Андрей А.К.",2,99999);
        employee[3] = new Employee("Петр В.В.",2,110000);
        employee[4] = new Employee("Мария Р.Е.",3,88001);
        employee[5] = new Employee("Федор В.К.",3,87000);
        employee[6] = new Employee("Ренат К.П.",4, 98000);
        employee[7] = new Employee("Дмитрий П.К.",7,67000);
        employee[8] = new Employee("Роберт В.Г.",5,140000);
        employee[9] = new Employee("Павел Н.Р.",5,125000);

        //Геттеры
        System.out.println(employee[5].getDepartment());
        System.out.println(employee[0].getFio());
        System.out.println(employee[0].getId());
        System.out.println(employee[0].getSalary());

        //Сеттеры
        employee[7].setDepartment(4);
        employee[9].setSalary(120000);

        //Получить список всех сотрудников со всеми имеющимися по ним данными
        EmployeeBook.soutEmployee(employee);

        //Посчитать сумму затрат на зарплаты в месяц.
        System.out.println(EmployeeBook.calculationMonthlySalaryAll(employee));

        //Найти сотрудника с минимальной зарплатой.
        System.out.println(EmployeeBook.findEmployeeMinSalaryAll(employee).getFio());

        //Найти сотрудника с максимальной зарплатой.
        System.out.println(EmployeeBook.findEmployeeMaxSalaryAll(employee).getFio());

        //Подсчитать среднее значение зарплат.
        System.out.println(EmployeeBook.averageValueSalaryAll(employee));

        //Получить Ф. И. О. всех сотрудников.
        for (Employee value : employee) {
            System.out.println(value.getFio());
        }
        System.out.println("Повышенная сложность:");
        //Повышенная сложность
        //Проиндексировать зарплату.
        EmployeeBook.indexSalaryAll(employee,10);
        EmployeeBook.soutEmployee(employee);

        //Параметр номер отдела.Сотрудника с минимальной зарплатой.
        System.out.println(EmployeeBook.findEmployeeMinSalary(employee,1).getFio());

        //Параметр номер отдела.Сотрудника с максимальной зарплатой.
        System.out.println(EmployeeBook.findEmployeeMaxSalary(employee,2).getFio());

        //Сумму затрат на зарплату по отделу.
        System.out.println(EmployeeBook.calculationMonthlySalary(employee,1));

        //Среднюю зарплату по отделу.
        System.out.println(EmployeeBook.averageValueSalary(employee,4));

        //Проиндексировать зарплату всех сотрудников отдела на процент,
        // который приходит в качестве параметра.
        EmployeeBook.indexSalary(employee,1,10);
        EmployeeBook.soutEmployee(employee);

        //Напечатать всех сотрудников отдела (все данные, кроме отдела).
        EmployeeBook.soutEmployeeDepartment(employee,5);

        //Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа.
        EmployeeBook.findEmployeesWithSalaryLess(employee,100000);

        //Получить в качестве параметра число и найти всех сотрудников с зарплатой больше числа.
        EmployeeBook.findEmployeesWithSalaryMore(employee,100000);
    }
}