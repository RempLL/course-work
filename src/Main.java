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
        System.out.println();

        //Сеттеры
        employee[7].setDepartment(4);
        employee[9].setSalary(120000);

        //Получить список всех сотрудников со всеми имеющимися по ним данными
        SettingsEmployee.soutEmployee(employee);
        System.out.println();

        //Посчитать сумму затрат на зарплаты в месяц.
        System.out.println(SettingsEmployee.calculationMonthlySalary(employee));
        System.out.println();

        //Найти сотрудника с минимальной зарплатой.
        for (Employee element : employee) {
            if (element.getSalary() == SettingsEmployee.findMinimumSalary(employee)) {
                System.out.println(element.getFio());
            }
        }
        System.out.println();

        //Найти сотрудника с максимальной зарплатой.
        for (Employee item : employee) {
            if (item.getSalary() == SettingsEmployee.findMaximumSalary(employee)) {
                System.out.println(item.getFio());
            }
        }
        System.out.println();

        //Подсчитать среднее значение зарплат.
        System.out.println(SettingsEmployee.averageValueSalary(employee));
        System.out.println();

        //Получить Ф. И. О. всех сотрудников.
        for (Employee value : employee) {
            System.out.println(value.getFio());
        }

    }
}