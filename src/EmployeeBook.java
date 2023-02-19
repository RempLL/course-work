public class EmployeeBook {
    private final Employee[] employee;

    public EmployeeBook() {
        this.employee = new Employee[10];
        employee[0] = new Employee("Альберт Н.И.", 1, 100000);
        employee[1] = new Employee("Виктор А.В.", 1, 90000);
        employee[2] = new Employee("Андрей А.К.", 2, 99999);
        employee[3] = new Employee("Петр В.В.", 2, 110000);
        employee[4] = new Employee("Мария Р.Е.", 3, 88001);
        employee[5] = new Employee("Федор В.К.", 3, 87000);
        employee[6] = new Employee("Ренат К.П.", 4, 98000);
        employee[7] = new Employee("Дмитрий П.К.", 4, 67000);
        employee[8] = new Employee("Роберт В.Г.", 5, 140000);
        employee[9] = new Employee("Павел Н.Р.", 5, 125000);
    }

    //Базовая сложность
    public void soutEmployee() {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public int calculationMonthlySalaryAll() {
        int salaryMonth = 0;
        for (Employee value : employee) {
            if (value != null) {
                salaryMonth += value.getSalary();
            }
        }
        return salaryMonth;
    }

    public Employee findEmployeeMinSalaryAll() {
        Employee employee1 = null;
        int min = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if (value != null && value.getSalary() < min) {
                min = value.getSalary();
                employee1 = value;
            }
        }
        return employee1;
    }

    public Employee findEmployeeMaxSalaryAll() {
        Employee employee2 = null;
        double max = Integer.MIN_VALUE;
        for (Employee value : employee) {
            if (value != null && value.getSalary() > max) {
                max = value.getSalary();
                employee2 = value;
            }
        }
        return employee2;
    }

    public double averageValueSalaryAll() {
        return calculationMonthlySalaryAll() / 10D;
    }

    public void soutFullName() {
        for (Employee value : employee) {
            if (value != null) {
                System.out.println(value.getFio());
            } else {
                System.out.println("null");
            }
        }
    }

    //Повышенная сложность
    public void indexSalaryAll(int percent) {
        double coeff = 1 + percent / 100D;
        for (Employee person : employee) {
            if (person != null) {
                person.setSalary((int) (person.getSalary() * coeff));
            }
        }
    }

    public Employee findEmployeeMinSalary(int department) {
        Employee employee3 = null;
        int min = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if (value != null && value.getSalary() < min && value.getDepartment() == department) {
                min = value.getSalary();
                employee3 = value;
            }
        }
        return employee3;
    }

    public Employee findEmployeeMaxSalary(int department) {
        Employee employee4 = null;
        double max = Integer.MIN_VALUE;
        for (Employee value : employee) {
            if (value != null && value.getSalary() > max && value.getDepartment() == department) {
                max = value.getSalary();
                employee4 = value;
            }
        }
        return employee4;
    }

    public int calculationMonthlySalary(int department) {
        int salaryMonth = 0;
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department) {
                salaryMonth += value.getSalary();
            }
        }
        return salaryMonth;
    }

    public double averageValueSalary(int department) {
        int sum = 0;
        int count = 0;
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department) {
                sum += value.getSalary();
                count++;
            }
        }
        if (count != 0) {
            return sum / (double) count;
        } else {
            return 0;
        }
    }

    public void indexSalary(int department, int percent) {
        double coeff = 1 + percent / 100D;
        for (Employee person : employee) {
            if (person != null && person.getDepartment() == department) {
                person.setSalary((int) (person.getSalary() * coeff));
            }
        }
    }

    public void soutEmployeeDepartment(int department) {
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department) {
                System.out.println("id:" + value.getId() + " Ф.И.О: " + value.getFio() + " Зарплата: " + value.getSalary());
            }
        }
    }

    public void findEmployeesWithSalaryLess(int salary) {
        for (Employee value : employee) {
            if (value != null && value.getSalary() < salary) {
                System.out.println("id:" + value.getId() + " Ф.И.О: " + value.getFio() + " Зарплата: " + value.getSalary());
            }
        }
    }

    public void findEmployeesWithSalaryMore(int salary) {
        for (Employee value : employee) {
            if (value != null && value.getSalary() > salary) {
                System.out.println("id:" + value.getId() + " Ф.И.О: " + value.getFio() + " Зарплата: " + value.getSalary());
            }
        }
    }

    //Очень сложно
    public void addEmployee(Employee employees) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = employees;
                break;
            }
        }
    }

    public void deleteEmployeeFullName(String fullName) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getFio().equals(fullName)) {
                employee[i] = null;
                break;
            }
        }
    }

    public void deleteEmployeeId(int ide) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getId() == ide) {
                employee[i] = null;
                break;
            }
        }
    }

    public void changeSalary(String fullName, int newSalary) {
        for (Employee value : employee) {
            if (value != null && value.getFio().equals(fullName)) {
                value.setSalary(newSalary);
            }
        }
    }

    public void changeDepartment(String fullName, int newDep) {
        for (Employee value : employee) {
            if (value != null && value.getFio().equals(fullName)) {
                value.setDepartment(newDep);
            }
        }
    }

    public void getFioByDepartment() {
        for (int i = 1; i < 6; i++) {
            StringBuilder result = new StringBuilder();
            for (Employee value : employee) {
                if (value != null && value.getDepartment() == i) {
                    result.append(value).append("\n");
                }
            }
            if (!result.isEmpty()) {
                System.out.println("Сотрудники отдела " + i + "\n" + result);
            }
        }
    }
}